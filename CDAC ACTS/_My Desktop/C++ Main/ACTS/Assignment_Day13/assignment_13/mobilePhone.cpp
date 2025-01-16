#include <iostream>
#include <string>
#include <fstream>
using namespace std;

class Mobile{
	private:
	string serialNo;
	string modelNo;
	string brandName;
	float price;

	public:

	void Accept(){
		cout<<"Enter serial No : ";
		cin>>serialNo;
		cout<<"Enter Model No  : ";
		cin>>modelNo;
		cout<<"Enter Brand Name: ";
		cin>>brandName;
		cout<<"Enter Price     : ";
		cin>>price;
	
	}


	void DisplayData(){
	
		cout<<"Enter serial No : "<<serialNo<<endl;
                cout<<"Enter Model No  : "<<modelNo<<endl;
                cout<<"Enter Brand Name: "<<brandName<<endl;
                cout<<"Enter Price     : "<<price<<endl;

		cout<<"Printing Data In file..."<<endl;
	}

	void writeFile(){
		ofstream fout("mobile.txt");
		if(!fout)
		{
			cout<<"\n Unable To Open File..."<<endl;
		}
		else
		{
			fout<<serialNo<<endl;
			fout<<modelNo<<endl;
			fout<<brandName<<endl;
			fout<<price<<endl;
		}
		fout.close();

	}

	void readFile(){
		ifstream fin;
		fin.open("mobile.txt");
		string ch;
		if(!fin)
		{
			cout<<"File Not Found..!!"<<endl;
		}
		while(!fin.eof())
		{
		getline(fin,ch);
		cout<<ch<<endl;

		}
	}

};




int main()
{
	Mobile m;
	m.Accept();
	m.DisplayData();
	m.writeFile();
	m.readFile();
return 0;
}



























#include<iostream>
#include<string>

using namespace std;

struct Student
{
        int rollno;
        string name;
};

void inputArr(Student s[],int x){
 

	
              cout<<"Enter roll no: ";
              cin>>s[x].rollno;
              cin.ignore();

              cout << "Enter name: ";
              getline(cin, s[x].name);
      

}
void output(Student s[],int y)
{
  cout<<"\n Name: "<<s[y].name<<endl;
  cout<<"\n Rollno: "<<s[y].rollno<<endl;  

}
int main()
{
        int n;
        cin>>n;

	Student s[n];
        for(int i=0;i<n;i++)
	{
		inputArr(s,i);
	}
	for(int i=0;i<n;i++)
        {
                output(s,i);
        }


  return 0;
}


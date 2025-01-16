//Create Student class and add rno and name in it. 
//Create AcceptData function which will take an input for student object.
//Write one more function to display student data.
//Sort an array of students by rno.

#include<iostream>
using namespace std;

class StudentInfo
{
	private:
	int rno;
	string name;

	public:

	void AcceptData()
	{
		cout<<"Enter the roll number"<<endl;
		cin>>rno;

		cout<<"Enter the name"<<endl;
		cin>>name;
	}


	void DisplayData()
	{
			cout<<"The roll number is: "<<rno<<endl;
			cout<<"The name of the student is: "<<name<<endl;
	}

	
	void Sort(StudentInfo*	s, int n)
	{
		for (int i=0; i<n-1; i++)
		{
			for (int j=1; j<n-i-1; j++)
			{
				if (s[j].rno > s[j+1].rno)
				{
					StudentInfo temp = s[j+1];
					s[j+1] = s[j];
					s[j] = temp;
				}
			}
		}

	}

};

int main()
	{
		cout << "Enter the number of objects.";
		int n;
		cin>>n;

		StudentInfo s[n];	
		for (int i = 0; i<n; i++)
		{
			s[i].AcceptData();
			//s[i].DisplayData ();
		}
	s[0].Sort(s,n);
		for(int i=0; i<n; i++)
				{
					s[i].DisplayData();
				}
		return 0;
	}
	

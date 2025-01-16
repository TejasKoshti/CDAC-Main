//Create Employee class and add empNo, name, salary and dept in it. 
//Create AcceptData function which will take an input . 
//Write one more function to display Employee data.



#include <iostream>
#include <cstring>
using namespace std;

class Employee
{
	int number;
	string name, dept;
	double salary;

	public:

	void AcceptData()
	{
		cout<<"\nEnter the employee's name: ";
		cin>>name;
		cout<<"\nEnter the employee's department: ";
		cin>>dept;
		cout<<"\nEnter the employee's salary : ";
		cin>>salary;
		cout<<"\nEnter the employee's number ";
		cin>>number;
	}

	void DisplayData()
	{
		cout<<"\nEmployee's number: "<<number;
		cout<<"\nEmployee's name: "<<name;
		cout<<"\nEmployee's salary: "<<salary;
		cout<<"\nEmployee's department: "<<dept;
	}
};

int main()
{
	Employee E;
	E.AcceptData();
	E.DisplayData();

	return 0;
}

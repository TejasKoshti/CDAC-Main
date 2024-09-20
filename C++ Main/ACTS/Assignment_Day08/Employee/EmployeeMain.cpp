#include <iostream>
#include "Employee.h"
using namespace std;

int main()
{
	Employee *sarr= new Employee[2];
	cout<<"enter details"<<endl;
	for(int i =0; i<2; i++)
        {
		int empNo;
		string name;
		string dept;
		double salary;
		cout<<"enter empNo"<<endl;
        cin>>empNo;
		cout<<"enter name"<<endl;
		cin>>name;
		cout<<"enter dept"<<endl;
		cin>>dept;
		cout<<"enter salary"<<endl;
		cin>>salary;
                sarr[i].Accept( empNo,  name, dept, salary);
        }
        
        for(int i =0; i<2; i++)
        {
                sarr[i].Display();
        }

	delete [] sarr;

	return 0;
}

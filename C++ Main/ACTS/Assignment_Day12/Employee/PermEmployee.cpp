//PermEmployee class

#include "PermEmployee.h"


       void PermEmployee::Accept(){

		cout<<"Accept PermEmployee:"<<endl;

		cout<<"enter name: ";
		getline(cin,name);

		cout<<"enter salary: ";
		cin>>salary;
		
		
		}

		double PermEmployee::CalcSalary(){

           // Permanent employees have a fixed annual salary
			return salary;
		}
		
		void PermEmployee::Display(){
		
		cout<<"display p:"<<endl;

		cout << "Permanent Employee: " << name << "\n";
        cout << "Annual Salary: $" << salary << "\n";
		}



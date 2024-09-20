//ContractEmp class

#include "ContractEmployee.h"
	

	    
		void ContractEmployee::Accept(){
		

		cout << "CE Accept" << endl;
    
    cin.ignore();  
    cout << "Enter name: ";
    getline(cin, name);

    cout << "Rate: ";
    cin >> rate;
    cin.ignore();  

    cout << "Hours Worked: ";
    cin >> hoursWorked;
    cin.ignore();
		}

		double ContractEmployee::CalcSalary(){

			cout<<"ContEmp salary:"<<endl;
			return rate * hoursWorked; // Contract employees are paid based on hours worked
		}

		void ContractEmployee::Display(){
			cout<<"CE Display:"<<endl;
			cout << "Contract Employee: " << name << "\n";
        cout << "Hourly Rate: $" << rate << "\n";
        cout << "Hours Worked: " << hoursWorked << "\n";
        cout << "Total Salary: $" << CalcSalary() << "\n";
		}

		
		
		



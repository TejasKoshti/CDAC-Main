//ContractEmp Header

#include "Employee.h"

// Derived class for contract employees
class ContractEmployee:public Employee
{
	private:
		string name;
		double rate;
		int hoursWorked;

	public:
	    void Accept();
		void Display();
		double CalcSalary();
		
		

};

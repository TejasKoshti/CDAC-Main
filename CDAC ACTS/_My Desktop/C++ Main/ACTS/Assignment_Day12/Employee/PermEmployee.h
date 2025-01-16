//PermEmp Header

#include "Employee.h"

// Derived class for permanent employees
class PermEmployee:public Employee
{
	private:
		string name;
		double salary;

	public:
	    void Accept();
		double CalcSalary();
		
		void Display();

};

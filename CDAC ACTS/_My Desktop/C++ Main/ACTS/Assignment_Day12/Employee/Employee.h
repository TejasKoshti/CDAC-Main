//Employee Header

#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include<iostream>

using namespace std;

// Base class for all employees
class Employee
{
	public:
	    // Pure virtual function to calculate salary, making this an abstract class
		virtual double CalcSalary() = 0;
        virtual void Accept() = 0;
		virtual void Display() = 0;


};

#endif

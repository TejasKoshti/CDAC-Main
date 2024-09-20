#include <iostream>
#include "Employee.h"
#include <string>

using namespace std;

Employee::Employee()
{
	empNo = 0;
	name = "";
	dept = "";
	salary = 0;
}
	
Employee::Employee(int empNo, string name, string dept, double salary)
{
	this->empNo = empNo;
	this->name = name;
	this->dept = dept;
	this->salary = salary;
}

void Employee::Accept(int empNo, string name, string dept, double salary)
{
	this->empNo = empNo;
	this->name = name;
	this->dept = dept;
	this->salary = salary;
}

void Employee::Display()
{
	cout<<"empNo: "<<empNo<<endl;
	cout<<"Name: "<<name<<endl;
	cout<<"Dept: "<<dept<<endl;
	cout<<"Salary: "<<salary<<endl;
}

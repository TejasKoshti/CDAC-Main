#include <iostream>
#include "Student.h"
#include <string>

using namespace std;

Student::Student()
{
	rno = 0;
	name = "";
}
	
Student::Student(int rno, string name)
{
	this->rno = rno;
	this->name = name;
}

void Student::Accept(int rno, string name)
{
	this->rno = rno;
	this->name = name;
}

void Student::Display()
{
	cout<<"Rollno: "<<rno<<endl;
	cout<<"Name: "<<name<<endl;
}

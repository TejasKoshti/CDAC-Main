#include <iostream>
#include "Student.h"
using namespace std;

int main()
{
	int rno;
	string name;
/*	Student s;
	s.Accept(rno,name);
	s.Display();
*/
/*
	Student sarr[2];
	for(int i =0; i<2; i++)
	{
		sarr[i].Accept(rno,name);
		sarr[i].Display();
	}
*/
	Student *sarr= new Student[2];
	for(int i =0; i<2; i++)
        {
        	cin>>rno;
		cin>>name;
                sarr[i].Accept(rno,name);
        }
        
        for(int i =0; i<2; i++)
        {
                sarr[i].Display();
        }

	delete [] sarr;
	return 0;
}

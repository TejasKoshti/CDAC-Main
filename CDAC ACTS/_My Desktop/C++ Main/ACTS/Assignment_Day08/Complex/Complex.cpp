#include <iostream>
#include "Complex.h"
using namespace std;

Complex::Complex()
{
	real = 0;
	img = 0;
	count++;
}

Complex::Complex(int real, int img)
{
	this->real = real;
	this->img = img;
	count++;
}

int Complex::counter()
{
	return count;
}

void Complex::Accept(int real, int img)
{
	this->real = real;
        this->img = img;
}

void Complex::Display()
{
	cout<<"Real = "<<real;
	cout<<"\t Img = "<<img<<endl;
}
int Complex::count = 0;

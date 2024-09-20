#include <iostream>
#include "Complex.h"
using namespace std;

int main()
{
	Complex c[2];
	
	for(int i=0; i<2; i++)
	{
		int real, img;
		cin>>real>>img;
		c[i].Accept(real, img);
	}
	
	for(int i=0; i<2; i++)
	{
		c[i].Display();
	}
	cout<<"number of object are: "<<Complex::counter()<<endl;
	return 0;
}

#include<iostream>
using namespace std;
int main()
{
	int number,total;
	cout << "enter the four digit number "<<endl;
	cin>>number;	
	total = 0;
	while(number>0)
	{
	total = total + number % 10;
	number = number /10;
	}
	cout<<"addition is "<<total<<endl;
	return 0;

}


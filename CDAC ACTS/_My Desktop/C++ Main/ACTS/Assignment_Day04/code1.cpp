#include<iostream>
using namespace std;

void swap(int &a, int &b)
{
	int temp;

	temp =a;
	a = b;
	b =temp;


	cout<<a<<" "<<b;
}





int main(){
  int x,y;
  cin>>x;
  cin>>y;

  swap(x,y);



return 0;
}

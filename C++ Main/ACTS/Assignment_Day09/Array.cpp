// Create an array class and implement constructor, destructor, Accept Display function.

#include<iostream>
using namespace std;

class Array
{
	private:
	 int *p;
//       SIZE
	 int s;
	public:
//	 Array(){
//		 cout<<"Ctor calling..!"<<endl;
//	 	*p=NULL;
//		s=0;
//	 }
	 Array(int size)
	 {
		cout<<"Pctor Calling..!"<<endl;
	 	s = size;
		p = new int[s];
	 }
	 void Accept()
	 {
	 	cout<<"Enter the no nof elemets"<<endl;
	 	cin>>s;

	 	for(int i=0;i<s;i++)
	 	{
	 		cin>>p[i];
		}
	 }
	 void Display()
	 {
	   	cout<<"Eelemts are:"<<endl;
	   	for(int i=0 ; i<s ; i++)
	   	{
	   		cout<<p[i]<<endl;
	   	}
	 }
	 
	 ~Array()
	 {
	 	delete []p;
	 }
};

int main()
{
	Array a(2);
	a.Accept();
	a.Display();
  return 0;
}

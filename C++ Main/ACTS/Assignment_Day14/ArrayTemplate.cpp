#include <iostream>
using namespace std;

template <class T>
class Array
{
	public:
		T* arr;
		int size;
		Array(int m)
		{
			size = m;
			arr = new T[size];
		}
		void Display()
		{       cout<<"[ ";
			for(int i= 0; i< size ;i++)
			cout<<arr[i]<<",";

			cout<<"]"<<endl;
		}

};

int main()
{
	Array<int> i(3);
	       	i.arr[0] = 10;
		 i.arr[1] = 20;
		 i.arr[2] = 30;

	Array<float> f(3);
	  f.arr[0] = 0.1;
                 f.arr[1] = 0.2;
                 f.arr[2] = 0.3;

	Array<char> c(3);
	  c.arr[0] = 'A';
                 c.arr[1] = 'B';
                 c.arr[2] = 'C';

	i.Display();
	f.Display();
	c.Display();
  return 0;

}


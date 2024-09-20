// Overload +, -, * operator for Complex number class
#include<iostream>
using namespace std;
class Complex
{
	private:
		//DM
		int real;
		int img;
	public:
		//No -arg ctor
	Complex() : real(0), img(0)
		{
		}
		//paramtererised ctor
		//All Arg ctor
		Complex(int real, int img): real(real), img(img)
		{
		}

		//MF
		void Accept()
		{
		cout<<"\n Please enter real and img part"<<endl;
		cin>>this->real;
		cin>>this->img;

		}

		//c3 = c1.Add(c2)
		//Complex Add(const Complex& b)
	/*	Complex operator+(const Complex& b)
		{
			Complex res;
			res.real = this->real + b.real;
			res.img = this->img + b.img;
			return res;

		}*/
		
	/*	Complex operator-(const Complex& b)
		{
			Complex res;
			res.real = this->real - b.real;
			res.img = this->img - b.img;
			return res;

		}*/
		
		Complex operator*(const Complex& b)
		{
			Complex res;
			res.real = this->real*real + this->img*img;
			res.img = this->real*img + this->img*real;
			return res;

		}

		void Display()
		{
		cout<<"\n Complex [ real="<<real;
		cout<<", img="<<img<<"]"<<endl;
		}

};

int main()
{
	Complex c1(5,5);
	Complex c2(10,10);
	Complex c3(11,11);
	Complex c4;
	//c4 = c1 + c2 + c3;
        //c4 = c1.Add(c2).Add(c3);
	//c4.Display();
	
	//Complex c5;
	
	//c5 = c4 - c1;
	
	//c5.Display();
	
	Complex c6;
	
	c6 = c1*c2;
	
	c6.Display();

	return 0;
}









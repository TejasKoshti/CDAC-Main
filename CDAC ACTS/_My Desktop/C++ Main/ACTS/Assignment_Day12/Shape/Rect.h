#include "Shape.h"
#include<iostream>
using namespace std;

class Rect : public Shape {
	private:
		int le;
		int br;

	public:
		Rect(int le, int br);
		void Accpet();
		void Display();
		float CalcArea();
		float CalcPeri();

};

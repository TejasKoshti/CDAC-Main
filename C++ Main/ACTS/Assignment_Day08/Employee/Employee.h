#include <string>
using namespace std;
class Employee {
	private:
	int empNo;
	string name, dept;
	double salary;
	
	public:
	Employee();
	Employee(int, string,string,double);
	
	void Accept(int, string, string, double);
	void Display();
};

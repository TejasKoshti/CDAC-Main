#include <string>
using namespace std;
class Student {
	private:
	int rno;
	string name;
	
	public:
	Student();
	Student(int, string);
	
	void Accept(int, string);
	void Display();
};

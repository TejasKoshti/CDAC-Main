/*Implement constructor, parameterized constructor , Accept, Display functions in Student class. Try to create Student objects using new operator. 
Try creating student array and check if constructors are getting multiple times. 
Write constructor with initialization list for const D.M initialization.
Print this pointer inside function to check if it points to invoking object.*/
#include <iostream>
#include <string>
using namespace std;

class Student
{
    private:
        int rollno;
        string name;
        double marks;

    public:
        // Default constructor
        Student() : rollno(0), name(""), marks(0.0) {
            cout << "Default constructor called" << endl;
        }

        // Parameterized constructor with initialization list
        Student(int rollno, const string &name, double marks) 
            : rollno(rollno), name(name), marks(marks) {
            cout << "Parameterized constructor called" << endl;
            cout << "Rollno: " << rollno << " Name: " << name << " Marks: " << marks << endl;
        }

        // Accept data from user
        void AcceptData() {
            cout << "Enter the student's name: ";
            cin >> name;
            cout << "Enter the student's rollno: ";
            cin >> rollno;
            cout << "Enter marks: ";
            cin >> marks;
        }

        // Display data
        void DisplayData() const {
            cout << "Student's number: " << rollno << endl;
            cout << "Student's name: " << name << endl;
            cout << "Student's marks: " << marks << endl;
        }

        // Print pointer address
        void printPointer() const {
            cout << "This pointer: " << this << endl;
        }
};

int main() {
    int n;
    cout << "Enter the number of students: ";
    cin >> n;

    // Create an array of Student objects
    Student *s = new Student[n];

    // Accept data for each student
    for(int i = 0; i < n; i++) {
        s[i].AcceptData();
    }

    // Print the pointer address for the first student
    s->printPointer();

    // Display data for each student
    for(int i = 0; i < n; i++) {
        s[i].DisplayData();
    }

    // Cleanup dynamically allocated memory
    delete[] s;

    // Create a single Student object using the parameterized constructor
    Student *sp = new Student(1, "Raj", 85.0);
    sp->printPointer(); // Print pointer address of the single Student object
    sp->DisplayData();  // Display data of the single Student object

    delete sp; // Cleanup dynamically allocated single object

    return 0;
}


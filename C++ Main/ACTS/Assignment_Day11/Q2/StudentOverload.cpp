#include <iostream>
#include <string>

class Student {
private:
    std::string name;
    int id;
    float gpa;

public:
    // Default constructor
    Student() : name(""), id(0), gpa(0.0f) {}

    // Parameterized constructor
    Student(const std::string& name, int id, float gpa) : name(name), id(id), gpa(gpa) {}

    // Overload >> operator for input
    friend std::istream& operator>>(std::istream& in, Student& student) {
        std::cout << "Enter student name: ";
        in.ignore();  // Ignore newline character left in buffer
        std::getline(in, student.name);
        std::cout << "Enter student ID: ";
        in >> student.id;
        std::cout << "Enter student GPA: ";
        in >> student.gpa;
        return in;
    }

    // Overload << operator for output
    friend std::ostream& operator<<(std::ostream& out, const Student& student) {
        out << "Name: " << student.name << "\n"
            << "ID: " << student.id << "\n"
            << "GPA: " << student.gpa << "\n";
        return out;
    }
};

int main() {
    Student s;
    std::cin >> s; // Input student details
    std::cout << s; // Output student details

    return 0;
}


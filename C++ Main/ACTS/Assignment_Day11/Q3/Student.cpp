#include "Student.h"
#include <iostream>
#include <cstring>

// Default constructor
Student::Student() : id(0), gpa(0.0f) {
    strcpy(name, "");
}

// Parameterized constructor
Student::Student(const char* name, int id, float gpa, const Address& address)
    : id(id), gpa(gpa), address(address) {
    strcpy(this->name, name);
}

// Setter for Address
void Student::setAddress(const Address& address) {
    this->address = address;
}

// Getter for Address
Address Student::getAddress() const {
    return address;
}

// Friend functions for input and output
void inputStudent(Student& student) {
    char buffer[100];

    std::cout << "Enter student name: ";
    std::cin.getline(buffer, 100);
    student.setName(buffer);

    std::cout << "Enter student ID: ";
    std::cin >> student.id;

    std::cout << "Enter student GPA: ";
    std::cin >> student.gpa;
    std::cin.ignore(); // Clear newline character left in buffer

    std::cout << "Enter student address:\n";
    inputAddress(student.address);
}

void outputStudent(const Student& student) {
    std::cout << "Name: " << student.name << "\n"
              << "ID: " << student.id << "\n"
              << "GPA: " << student.gpa << "\n"
              << "Address:\n";
    outputAddress(student.address);
}


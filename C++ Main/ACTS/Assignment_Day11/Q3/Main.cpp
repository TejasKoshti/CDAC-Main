#include <iostream>
#include "Student.h"
#include "Address.h"

int main() {
    Student student;
    Address address;

    // Input student details
    std::cout << "Enter student details:\n";
    inputStudent(student);

    // Display student details
    std::cout << "\nStudent Details:\n";
    outputStudent(student);

    return 0;
}


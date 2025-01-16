#ifndef STUDENT_H
#define STUDENT_H

#include "Address.h"

class Student {
private:
    char name[100];
    int id;
    float gpa;
    Address address; // Association with Address class

public:
    // Default constructor
    Student();

    // Parameterized constructor
    Student(const char* name, int id, float gpa, const Address& address);

    // Setter and Getter for Address
    void setAddress(const Address& address);
    Address getAddress() const;

    // Friend functions for input and output
    friend void inputStudent(Student& student);
    friend void outputStudent(const Student& student);
};

#endif // STUDENT_H


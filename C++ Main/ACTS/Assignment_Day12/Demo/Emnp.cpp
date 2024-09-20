#include <iostream>
#include <string>

using namespace std;

// Base class for all employees
class Employee {
public:
    // Pure virtual function to calculate salary, making this an abstract class
    virtual double calculateSalary() const = 0;
    
    // Virtual destructor to ensure proper cleanup of derived classes
    virtual ~Employee() {}
};

// Derived class for permanent employees
class PermEmployee : public Employee {
private:
    string name;
    double annualSalary;

public:
    PermEmployee(const string& empName, double salary)
        : name(empName), annualSalary(salary) {}

    double calculateSalary() const override {
        return annualSalary; // Permanent employees have a fixed annual salary
    }

    void displayDetails() const {
        cout << "Permanent Employee: " << name << "\n";
        cout << "Annual Salary: $" << annualSalary << "\n";
    }
};

// Derived class for contract employees
class ContractEmployee : public Employee {
private:
    string name;
    double hourlyRate;
    int hoursWorked;

public:
    ContractEmployee(const string& empName, double rate, int hours)
        : name(empName), hourlyRate(rate), hoursWorked(hours) {}

    double calculateSalary() const override {
        return hourlyRate * hoursWorked; // Contract employees are paid based on hours worked
    }

    void displayDetails() const {
        cout << "Contract Employee: " << name << "\n";
        cout << "Hourly Rate: $" << hourlyRate << "\n";
        cout << "Hours Worked: " << hoursWorked << "\n";
        cout << "Total Salary: $" << calculateSalary() << "\n";
    }
};

int main() {
    // Create instances of PermEmployee and ContractEmployee
    Employee* emp1 = new PermEmployee("Alice", 60000);
    Employee* emp2 = new ContractEmployee("Bob", 50, 120);

    // Use base class pointers to call the derived class methods
    cout << "Employee Details:\n";
    cout << "-------------------\n";

    // Demonstrating runtime polymorphism
    cout << "Permanent Employee:\n";
    static_cast<PermEmployee*>(emp1)->displayDetails();

    cout << "\nContract Employee:\n";
    static_cast<ContractEmployee*>(emp2)->displayDetails();

    // Clean up dynamically allocated memory
    delete emp1;
    delete emp2;

    return 0;
}


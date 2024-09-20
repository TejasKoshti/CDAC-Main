//EmployeeMain 

#include "PermEmployee.h"
#include "ContractEmployee.h"

// Demonstrating runtime polymorphism

void Accept(Employee *e)
{
	e->Accept();
}

void Display(Employee *e)
{
        e->Display();
}

int main()
{
  PermEmployee pe;
  Accept(&pe);
  Display(&pe);
  pe.CalcSalary();


  ContractEmployee ce;
  Accept(&ce);
  ce.CalcSalary();
  Display(&ce);
  

   

    return 0;
}

using System.Collections.Generic;

namespace EmployeeAssignment
{
    internal class Program
    {
        static void Main()
        {
           List<Employee> elist = new List<Employee>();
            elist.Add(new Employee(1, "Rohit", 10000));
            elist.Add(new Employee(2, "Virat", 100000));
            elist.Add(new Employee(3, "Mahendra", 50000));
            elist.Add(new Employee(4, "Sachin", 70000));
            elist.Add(new Employee(5, "Jaspreet", 9000));

            foreach (Employee item in elist)
            {
                Console.WriteLine(item.toString());
            }
        }
    }

    public class Employee
    {
        int id;
        string name;
        decimal salary;



        public Employee(int id, string name, decimal salary)
        {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public string toString()
        {
            return "[id:" + this.id + ", Name:" + this.name + ", salary:" + this.salary + "]";
        }
    }
}

using System.Diagnostics.Metrics;

namespace Assignment1_Employee1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Employee o1 = new Employee("da d", 12346, 20);
            Employee o2 = new Employee("Amol", 12346);
            Employee o3 = new Employee("Amol");
            Employee o4 = new Employee();

            Console.WriteLine(o1.toString() + o1.GetNetSalary());
            Console.WriteLine(o2.toString() + o2.GetNetSalary());
            Console.WriteLine(o3.toString() + o3.GetNetSalary());
            Console.WriteLine(o4.toString() + o4.GetNetSalary());

            Console.WriteLine(o4.toString() + o4.GetNetSalary());
            Console.WriteLine(o3.toString() + o3.GetNetSalary());
            Console.WriteLine(o2.toString() + o2.GetNetSalary());
            Console.WriteLine(o1.toString() + o1.GetNetSalary());


        }
    }

    public class Employee
    {
        public string name;
        public int empNo;
        public decimal basic;
        public short deptNo;
        private static int Counter = 1;

        public string Name
        {
            set
            {
                if (!string.IsNullOrWhiteSpace(value))
                {
                    name = value;
                }
            }
            get
            {
                return name;
            }
        }

        public int EmpNo
        {
            get
            {
                return empNo;
            }
        }

        public decimal Basic
        {
            set
            {
                if (1000 <= value && value <= 100000)
                {
                    basic = value;
                }
            }
            get
            {
                return basic;
            }
        }

        public short DeptNo
        {
            set
            {
                if (value > 0)
                {
                    deptNo = value;
                }
            }
            get
            {
                return deptNo;
            }
        }

        public decimal GetNetSalary()
        {
            return Basic * 1.5M;
        }

        public Employee(string Name = "default", decimal Basic = 1000, short DeptNo = 10)
        {
            this.Name = Name;
            this.empNo = Counter++;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
        }

        public string toString()
        {
            return "Name = " + this.Name + ", EmpNo = " + this.EmpNo + ", Basic = " + this.Basic + ", DeptNo = " + this.DeptNo + "]";
        }
    }
}
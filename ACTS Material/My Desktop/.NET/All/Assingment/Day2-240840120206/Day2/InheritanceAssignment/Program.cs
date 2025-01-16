using System.Diagnostics.Metrics;
using System.Reflection;

namespace InheritanceAssignment
{
    internal class Program
    {
        
        static void Main(string[] args)
        {
            
            Employee m = new Manager();
            m = new CEO();
            Console.WriteLine(m.GetNetSalary());

        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

    public abstract class Employee : IDbFunctions
    {
        public string name;
        public int empNo;
        public decimal basic;
        public short deptNo;
        public int Counter = 1;

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

        public abstract decimal Basic { set; get; }
        
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

        public abstract decimal GetNetSalary();

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

        public void Insert()
        {
            Console.WriteLine("Employee class Insert");
        }

        public void Update()
        {
            Console.WriteLine("Employee class Update");
        }

        public void Delete()
        {
            Console.WriteLine("Employee class Delete");
        }
    }

    public class Manager : Employee, IDbFunctions
    {
        public string Designation { set; get; }

        public override decimal Basic
        {
            set
            {
                if(value > 2000)
                {
                    basic = value;
                }
            }
            get {  return basic; }
        }
        

        public override decimal GetNetSalary()
        {
            return Basic * 1.5M;
        }

        public Manager (string Name = "default", decimal Basic = 20001, short DeptNo = 10, string Designation="Desg")
        {
            this.Name = Name;
            this.empNo = Counter++;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
            this.Designation = Designation;
        }

        public void Insert()
        {
            Console.WriteLine("Manager class Insert");
        }

        public void Update()
        {
            Console.WriteLine("Manager class Update");
        }

        public void Delete()
        {
            Console.WriteLine("Manager class Delete");
        }
    }

    public class GeneralManager : Manager,IDbFunctions
    {
        string Perks { set; get; }

        public override decimal Basic
        {
            set
            {
                if (value > 3000)
                {
                    basic = value;
                }
            }
            get { return basic; }
        }

        public override decimal GetNetSalary()
        {
            return Basic * 2M;
        }

        public GeneralManager(string Name = "default", decimal Basic = 3001, short DeptNo = 10, string Designation = "Desg", string Perks="DefaultPerks")
        {
            this.Name = Name;
            this.empNo = Counter++;
            this.Basic = Basic;
            this.DeptNo = DeptNo;
            this.Designation = Designation;
            this.Perks = Perks;
        }

        public void Insert()
        {
            Console.WriteLine("GeneralManager class Insert");
        }

        public void Update()
        {
            Console.WriteLine("GeneralManager class Update");
        }

        public void Delete()
        {
            Console.WriteLine("GeneralManager class Delete");
        }
    }

    public class CEO : Employee, IDbFunctions
    {
        public override decimal Basic
        {
            set
            {
                if (value > 5000)
                {
                    basic = value;
                }
            }
            get { return basic; }
        }

        public sealed override decimal GetNetSalary()
        {
            return Basic * 5M;
        }

        public CEO(string Name = "default", decimal Basic = 5001, short DeptNo = 10)
        {
            this.Name = Name;
            this.empNo = Counter++;
            this.Basic = Basic;
            this.DeptNo = DeptNo;


        }

        public void Insert()
        {
            Console.WriteLine("CEO class Insert");
        }

        public void Update()
        {
            Console.WriteLine("CEO class Update");
        }

        public void Delete()
        {
            Console.WriteLine("CEO class Delete");
        }

    }
}
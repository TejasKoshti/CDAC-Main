namespace ClassBasics
{
    internal class Program
    {
        //static void Main()
        //{
        //    Payroll.Employee o = new Payroll.Employee();
        //    Payroll.Employee o2;
        //    Console.WriteLine("Hello, World!");
        //    Payroll.n1.Class1 obj;

        //}

        static void Main()
        {
            Class1 obj = new Class1();
            obj.Display();
            obj.Display("aaaa");

            //positional parameters
            Console.WriteLine(obj.Add(10, 20));
            Console.WriteLine(obj.Add(10, 20, 30));
            Console.WriteLine(obj.Add(10));
            Console.WriteLine(obj.Add());

            //named parameters
            Console.WriteLine(obj.Add(x: 10, y: 20, z: 30));
            Console.WriteLine(obj.Add(z: 10, y: 20));
            Console.WriteLine(obj.Add(10, z: 30));

            obj.DoSomething();

        }
    }

    public class Class1
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }

        public void Display(string s)
        {
            Console.WriteLine("Display " + s);
        }

        //public int Add(int x , int y, int z)
        //{
        //    return x + y;
        //}

        public int Add(int x, int y)
        {
            return x +y;
        }

        public int Add(int x=0, int y=0, int z=0)
        {
            return x + y + z;
        }

        public void DoSomething()
        {
            //int i;
            //Console.WriteLine(i);

            int i = 10;
            Console.WriteLine(i);

            DoSomething2();

            void DoSomething2()
            {
                Console.WriteLine(i);
            }

            //void DoSomething2(int i)
            //{
            //    Console.WriteLine(++i);
            //}
        }
    }

    namespace Payroll
    {
        public class Employee
        {
            static void Main1()
            {

            }
        }
        public class Department { }

        namespace n1
        {
            public class Class1 { }

        }
    }
}
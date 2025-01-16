using System.Reflection;

namespace InheritanceExample2
{
    internal class Program
    {
        static void Main1()
        {
            DerivedClass obj = new DerivedClass();
            //obj.Display1();
            //obj.Display1("abc");
            obj.Display2();
            obj.Display3();
        }

        static void Main()
        {
            BaseClass obj;
            obj = new BaseClass();
            //obj.Display1();
            //obj.Display2();
            //obj.Display3();

            Console.WriteLine();
            obj = new DerivedClass();
            //obj.Display1();
            //obj.Display2();
            //obj.Display3();

            Console.WriteLine();
            obj = new SubDerivedClass();
            //obj.Display1();
            //obj.Display2();
            //obj.Display3();

            Console.WriteLine();
            obj = new SubSubDerivedClass();
            obj.Display3();

            BaseClass o = new SubSubDerivedClass();
            o.Display3();
        }
    }

    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("base display1");
        }
        public void Display2()
        {
            Console.WriteLine("base display2");
        }
        public virtual void Display3()
        {
            Console.WriteLine("base display3");
        }
    }

    public class DerivedClass : BaseClass
    {
        public void Display1(string s)
        {
            Console.WriteLine("derived display1" + s);
        }
        public new void Display2()
        {
            Console.WriteLine("derived display2");
        }
        public override void Display3()
        {
            Console.WriteLine("derived display3");
        }
    }

    public class SubDerivedClass : DerivedClass
    {
        public override void Display3()
        {
            Console.WriteLine("subderived display3");
        }
    }

    public class SubSubDerivedClass : SubDerivedClass
    {
        public override void Display3()
        {
            Console.WriteLine("subsubderived dispaly3");
        }
    }
}

namespace OverloadingHidingOverriding
{
    internal class Program
    {
        static void Main()
        {
           DerivedClass o1 = new DerivedClass();
            //o1.Display1("abc");
            //o1.Display2();
            //o1.Display3();

            BaseClass o2 = new BaseClass();
            //o2.Display1();
            o2.Display2();
            o2.Display3();

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
            Console.WriteLine("derived dispaly1 " + s);
        }
        public new void Display2()
        {
            Console.WriteLine("derived display2");
        }
        public override void Display3()
        {
            Console.WriteLine("derived dispaly3");
        }
    }
}

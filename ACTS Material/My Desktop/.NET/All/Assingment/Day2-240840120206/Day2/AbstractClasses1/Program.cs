namespace AbstractClasses1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            AbsClass1 o;
            //o = new AbsClass1(); //error : we cannot create the object of the abstract class
        }
    }

    public abstract class AbsClass1
    {
        public void Display()
        {
            Console.WriteLine("display");
        }
    }

    public class  DerivedClass : AbsClass1 
    {
        
    }
}

namespace AbstractClasses2
{
    internal class Progra
    {
        static void Main(string[] args)
        {
            AbsClass1 o;
                                                                                      
            o = new DerivedClass();
            
            DerivedClass o2 = new DerivedClass();
            o2.Show();
            o2.Display();

            SealedClass s = new SealedClass();

        }
    }

    public abstract class AbsClass1
    {
        public abstract void Display();
        public abstract void Show();
    }

    public class DerivedClass : AbsClass1
    {
        public override void Display()
        {
            Console.WriteLine("Display");
        }

        public override void Show()
        {
            Console.WriteLine("Show");  
        }
    }

    public abstract class DerivedClass2 : AbsClass1
    {

    }

    public sealed class SealedClass
    {

    }
}

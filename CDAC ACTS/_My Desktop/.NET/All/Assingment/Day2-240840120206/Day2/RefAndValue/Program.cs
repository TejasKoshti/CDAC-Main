namespace RefAndValue
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 o1 = new Class1();
            Class1 o2 = new Class1();
            o1.i = 100;
            o2.i = 200;
            o1 = o2;
            o2.i = 300;
            Console.WriteLine(o1.i);
            Console.WriteLine(o2.i);
        }

        static void Main2(string[] args)
        {
            int o1, o2;
            o1 = 100;
            o2 = 200;
            o1 = o2;
            o2 = 300;
            Console.WriteLine(o1);
            Console.WriteLine(o2);
        }

        static void Main(string[] args)
        {
            string o1, o2;
            o1 = "100";
            o2 = "200";
            o1 = o2;
            o2 = "300";
            Console.WriteLine(o1);
            Console.WriteLine(o2);
            Console.ReadLine();
        }

        static void DataTypes()
        {
            byte by; //Byte
            sbyte by2; //SByte

            short sh; //Int16 -2
            ushort ush;

            int i;
            uint ui;

            long l;
            ulong ul;

            float f;
            double d;
            decimal c;

            char ch;
            bool b;

            object o;
            string s;
        }

        static void Boxing()
        {
            int i = 100;
            object o;
            o = i; //boxing
            int j;
            j = (int)o; //unboxing
        }
    }
    
    public class Class1
    {
        public int i;
    }
}

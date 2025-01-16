namespace StaticMembers
{
    internal class Program
    {
        private static void Main()
        {
            Class1 o1;
            o1 = new Class1();
            Console.WriteLine(Class1.s_P1);
            Class1.s_Display();
            Class1 o2 = new Class1();
            Class1.s_P1 = 100;
            Console.WriteLine(Class1.s_P1);
            o1.i = 100;
            o2.i = 200;
            o1.Display();

            Class1.s_i = 100;
            Console.WriteLine(Class1.s_i);
            Class1.s_P1 = 10;
        }
    }

    public class Class1
    {
        public int i;

        public static int s_i;

        public void Display()
        {
            Console.WriteLine("dispaly");
            Console.WriteLine(i);
            Console.WriteLine(s_i);
        }

        public static void s_Display()
        {
            Console.WriteLine("stataic dispaly");
            Console.WriteLine(s_i);
        }

        private int p1;
        public int P1 { set { p1 = value; } get { return p1; } }

        private static int s_p1;

        public static int s_P1
        {
            set { s_p1 = value; }
            get { return s_p1; }
        }

        static Class1()
        {
            Console.WriteLine("static cons");
            s_P1 = 200;
        }


        public Class1()
        {
            Console.WriteLine("cons");
        }
    }   
}

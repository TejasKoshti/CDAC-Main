namespace FieldsAndProperties
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            //o.Seti(12);

            //Console.WriteLine(o.Geti());

            o.P1 = 10;

            Console.WriteLine(o.P1);

            o.P2 = "abc";
            Console.WriteLine(o.P2);

            o.display();

            o.P3 = "pqr";
            Console.WriteLine(o.P3);

            o.P4 = 123;
            Console.WriteLine(o.P4);

            Console.WriteLine(o.P5);
        }
    }

    public class Class1
    {
        int i = 0;

        //public void Seti(int value)
        //{
        //    if (value < 100)
        //    {
        //        i = value;
        //    }
        //    else
        //    {
        //        Console.WriteLine("invalid value");
        //    }
        //}

        //public int Geti()
        //{
        //    return i;
        //}

        private int p1;

        public int P1
        {
            set
            {
                if(value < 100)
                {
                    p1 = value;
                }
                else
                {
                    Console.WriteLine("invalid valud");
                }
            }

            get
            {
                return p1;
            }
        }

        private string p2;

        public void display()
        {
            Console.WriteLine(p2);
        }

        public string P2
        {
            set
            {
                p2 = value;
            }

            get
            {
                return p2;
            }
        }

        public string P3;

        public int P4 { set; get; }

        public int P5 { get; }

    }
}
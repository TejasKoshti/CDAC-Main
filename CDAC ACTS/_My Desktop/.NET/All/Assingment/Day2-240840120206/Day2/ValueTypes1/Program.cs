namespace ValueTypes1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            MyPoint p = new MyPoint();
            Console.WriteLine(p.X);
        }
    }
    public struct MyPoint
    {
        public int A { get; set; }

        public int X;
        public int b;
        public int B
        {
            get { return b; }
            set { b = value; }
        }
        public MyPoint()
        {

        }
    }
}

namespace ValueTypes2
{
    class Program
    {
        static void Main()
        {
            Display1(11);
            Display2(TimeOfDay.Evening);
        }
        static void Display1(int t) 
        {
            if (t == 10)
                Console.WriteLine("Good Morning");
            else if (t == 11)
                Console.WriteLine("Good Afternoon");
            else if (t == 12)
                Console.WriteLine("Good Evening");
            else if (t == 13)
                Console.WriteLine("Good Night");
        }

        static void Display2(TimeOfDay t)
        {
            if (t == TimeOfDay.Morning)
                Console.WriteLine("Good Morning");
            else if (t == TimeOfDay.Afternoon)
                Console.WriteLine("Good Afternoon");
            else if (t == TimeOfDay.Evening)
                Console.WriteLine("Good Evening");
            else if (t == TimeOfDay.Night)
                Console.WriteLine("Good Night");
        }
    }
    public enum TimeOfDay
    {
        Morning=10,
        Afternoon=20,
        Evening,
        Night
    }
}
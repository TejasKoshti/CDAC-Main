//using TestAccessSpecifiers;
namespace AccessSpecifiers
{
    public class Program
    {
        static void Main(string[] args)
        {
            BaseClass o = new BaseClass();

            TestAccessSpecifiers.BaseClass obj = new TestAccessSpecifiers.BaseClass();
            Console.WriteLine("Hello, World!");

        }
    }

    public class BaseClass
    {
        int a;
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
    }
    public class  DerivedClass : TestAccessSpecifiers.BaseClass
    {
        

    }
}

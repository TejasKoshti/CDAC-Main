namespace DefaultImplementationOfinterfaces1
{
    internal class Program
    {
        static void Main1()
        {
            Class1 o = new Class1();

            IDbFunctions i = o;
            i.Select();
            (o as IDbFunctions).Select();
        }
    }
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
        void Select()
        {
            Console.WriteLine("def imp of select");
        }

    }
    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("IDb.Delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("IDb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("IDb.update from class1");
        }
    }
}

namespace DefaultImplementationOfinterfaces2
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            
            IDbFunctions i = o;
            i.Select();

            (o as IDbFunctions).Select();

            ((IDbFunctions)o).Select();
        }
    }
    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
        void Select()
        {
            Console.WriteLine("def imp of select");
        }
    }
    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("IDb.Delete from class1");
        }
        public void Insert()
        {
            Console.WriteLine("IDb.Insert from class1");
        }
        public void Update()
        {
            Console.WriteLine("IDb.update from class1");
        }
        void IDbFunctions.Select()
        {
            Console.WriteLine("IDb.select from class1");
        }
    }
}
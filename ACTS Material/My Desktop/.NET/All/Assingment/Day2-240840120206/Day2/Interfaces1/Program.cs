namespace Interfaces1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Class1 o = new Class1();
            o.Display();
            o.Delete();
            o.Update();
            o.Delete();
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }

    public class Class1 : IDbFunctions
    {
        public void Display()
        {
            Console.WriteLine("Display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("IDb.Delete from class1");
        }

        public void Insert()
        {
            Console.WriteLine("IDb.Write from class1");
        }

        public void Update()
        {
            Console.WriteLine("IDb.Update from class1");
        }
    }
}


namespace Interfaces2
{
    internal class Program
    {
        static void Main1()
        {
            Class1 o = new Class1();
            //o.Insert();
            //o.Close();
            //o.Update();

            //IFileFunctions oIFile;
            //oIFile = o;
            //oIFile.Open();
            //oIFile.Close();
            //oIFile.Delete();
            o.Delete();
            ((IFileFunctions)o).Open();
            (o as IFileFunctions).Delete();
        }
    }

    public interface IDbFunctions
    {
        void Insert();
        void Update();
        void Delete();
    }
    public interface IFileFunctions
    {
        void Open();
        void Close();
        void Delete();
    }
    
    public class Class1 : IDbFunctions, IFileFunctions
    {
        public void Display()
        {
            Console.WriteLine("Display from class1");
        }
        public void Delete()
        {
            Console.WriteLine("IDb.Delete from class1");
        }

        public void Insert()
        {
            Console.WriteLine("IDb.Write from class1");
        }

        public void Update()
        {
            Console.WriteLine("IDb.Update from class1");
        }

        public void Open()
        {
            Console.WriteLine("IFile.Open from class1");
        }

        public void Close()
        {
            Console.WriteLine("IFile.Update from class1");
        }

        void IFileFunctions.Delete()
        {
            Console.WriteLine("IFile.delete from class1");
        }
    }
}


namespace Interfaces3
{
    class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            //o.Delete();

            //((IDbFunctions)o.Delete());
            (o as IFileFunctions).Delete();
        }
    }
    public interface IDbFunctions : IFileFunctions
    {
        void Insert();
        void Update();
        new void Delete()
        {
            Console.WriteLine("IDbFunctions Delete");
        }
    }
    public interface IFileFunctions
    {
        void Open();
        void Close();
        virtual void Delete()
        {
            Console.WriteLine("IFileFunction Delete");
        }
    }
    public class Class1 : IDbFunctions
    {
        public void Close()
        {
            throw new NotImplementedException();
        }

        public void Insert()
        {
            throw new NotImplementedException();
        }
        //public void Delete()
        //{
        //    Console.WriteLine("Class Delete");
        //}
        public void Open()
        {
            throw new NotImplementedException();
        }

        public void Update()
        {
            throw new NotImplementedException();
        }
    }
}
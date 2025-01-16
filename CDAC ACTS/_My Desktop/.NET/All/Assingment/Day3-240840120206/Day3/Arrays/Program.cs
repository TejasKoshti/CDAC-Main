namespace Arrays
{
    internal class Program
    {
        static void Main1()
        {
            int[] arr = new int[5];
            for(int i=0; i<arr.Length; i++)
            {
                arr[i] = i*2;
            }
            for(int i=0; i<arr.Length; i++)
            {
                //Console.WriteLine("Enter the value for arr["+i+"] : " + arr[i]); //string concatenation
                //Console.WriteLine("Enter the value for arr[{0}] :", i); //placeholders
                Console.WriteLine($"Enter value for {arr[i]} :" + arr[i]); //interpolation
            }
            Console.WriteLine();
            foreach(int item in arr)
            {
                //item = 10; // error - item is readonly in foreach loop
                Console.WriteLine(item);
            }
            Console.WriteLine();
        }

        static void Main2()
        {
            int[] arr = { 10, 20, 30, 20, 40 };
            int[] arr2 = new int[5] { 1, 2, 3, 4 ,5 };

            int pos = Array.IndexOf(arr, 20);
            pos = Array.LastIndexOf(arr, 20);
            if(pos == -1)
            {
                Console.WriteLine("not found");
            }
            else
            {
                Console.WriteLine("position : " + pos);
            }

            //Array.Clear(arr); // Clear() method assign each element of an array to its default value and not delete the element
            foreach (int item in arr)
            {
                //item = 10; // error - item is readonly in foreach loop
                Console.WriteLine(item);
            }
            Console.WriteLine(arr.Length);
            pos = Array.BinarySearch(arr, 20);
            Console.WriteLine("position : " + pos);

            arr2 = new int[4] { 1, 2, 3, 4 };
            Array.Copy(arr, arr2, 3);
            foreach (int item in arr2)
            {
                //item = 10; // error - item is readonly in foreach loop
                Console.WriteLine(item);
            }

            Array.Reverse(arr);
            Array.Sort(arr);
        }

        static void Main3()
        {
            int[,] arr = new int[5, 3];
            //Console.WriteLine(arr.Length); // 5*3 = 15
            //Console.WriteLine(arr.Rank); // no. of dimentions 
            //Console.WriteLine(arr.GetLength(0));
            //Console.WriteLine(arr.GetLength(1));
            //Console.WriteLine(arr.GetUpperBound(0));
            //Console.WriteLine(arr.GetLowerBound(0));

            for(int i = 0; i < arr.GetLength(0); i++)
            {
                for(int j = 0; j < arr.GetLength(1); j++)
                {
                    //Console.WriteLine("arr[{0},{1}]", i, j); // {0}=i {1}=j placeholder
                    //Console.WriteLine($"arr[{i},{j}]");
                    arr[i, j] = int.Parse(Console.ReadLine()!);
                    Console.WriteLine($"arr[{i},{j}]"+ arr[i,j]);
                }
            }
        }

        static void Main4()
        {
            int[][] arr = new int[4][];
            arr[0] = new int[3]; // arr[0][0] arr[0][1] arr[0][2]
            arr[1] = new int[4]; // arr[1][0] arr[1][1] arr[1][2] arr[1][3]
            arr[2] = new int[2];//  arr[2][0] - arr [2][1]
            arr[3] = new int[3];//  arr[3][0] arr[3][1] arr[3][2]

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write("enter value for subscript [{0}][{1}] : ", i, j);
                    arr[i][j] = Convert.ToInt32(Console.ReadLine()); // converts null to 0 which int.Parse does not do

                }
            }
        }

        static void Main()
        {
            Employee[] employees = new Employee[5];
            employees[0] = new Employee();
            employees[1] = new Employee();
            employees[2] = new Employee();
            employees[3] = new Employee();
            employees[4] = new Employee();

            foreach (Employee e in employees)
            {
                e.Name = "ddk";
                Console.WriteLine(e.Name);
            }
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string? Name { get; set; }  

        public Employee(int EmpNo=1,string Name="abc")
        {
            this.EmpNo = EmpNo;
            this.Name = Name;
        }
    }
}

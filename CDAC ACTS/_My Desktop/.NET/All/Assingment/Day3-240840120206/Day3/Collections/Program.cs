using System.Collections;

namespace Collections
{
    internal class Program
    {
        static void Main1()
        {
            ArrayList objArrayList = new ArrayList();
            objArrayList.Add("Vikram");
            objArrayList.Add(10);
            objArrayList.Add(true);

            objArrayList.Insert(0, "inserted"); //Insert method insert the element at specified index and shift another elements

            ArrayList objArrayList2 = new ArrayList();
            objArrayList2.Add(10);
            objArrayList2.Add(20);
            objArrayList2.Add(30);

            //objArrayList.AddRange(objArrayList2); //Add the elements of alist2 to the end of alist1

            //objArrayList.InsertRange(0, objArrayList2); //Add the elements of alist2 from the specified index and shift other elements of alist1

            //objArrayList.RemoveRange(0, 1);

            //ArrayList arr3 = (ArrayList)objArrayList.Clone();

            //objArrayList.Clear();

            //bool ispresent = objArrayList.Contains(10);
            //Console.WriteLine(ispresent);

            object[] arr = new object[objArrayList.Count];
            objArrayList.CopyTo(arr);

            object[] arr2 = objArrayList.ToArray();

            foreach (object item in arr)
            {
                Console.WriteLine(item);
            }
        }

        static void Main2()
        {
            ArrayList objArrayList = new ArrayList();
            objArrayList.Add(10);
            objArrayList.Add(10);
            objArrayList.Add(10);
            objArrayList.Add(10);
            objArrayList.Add(10);

            Console.WriteLine(objArrayList.Count +"  "+ objArrayList.Capacity);

            objArrayList.TrimToSize();

            Console.WriteLine(objArrayList.Count +"  "+ objArrayList.Capacity);

            
        }

        static void Main3()
        {

            //Hashtable objDictionary = new Hashtable();
            SortedList objDictionary = new SortedList();
            objDictionary.Add(4, "Shivangi");
            objDictionary.Add(1, "Ankit");
            objDictionary.Add(2, "Raj");
            objDictionary.Add(3, "Shivani");
            objDictionary.Add(5, "Vikram");

            objDictionary[6] = "new";
            //objDictionary[5] = "update";

            objDictionary.Remove(6);//key
            objDictionary.RemoveAt(1); //index

            //foreach (DictionaryEntry item in objDictionary)
            //{
            //    Console.Write(item.Key + "  ");
            //    Console.WriteLine(item.Value);
            //}

            bool contain = objDictionary.Contains(1);
            bool containkey = objDictionary.ContainsKey(1);
            bool containvalue = objDictionary.ContainsValue("Vikram");
            Console.WriteLine(containvalue);

            IList keys = objDictionary.GetKeyList();
            foreach (var item in keys)
            {
                Console.WriteLine(Convert.ToInt32(item));
            }


        }

        static void Main4()
        {
            Stack s = new Stack();
            s.Push("aa");
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue q = new Queue();
            q.Enqueue(1);
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());
        }

        static void Main5()
        {
            List<int> list = new List<int>();
            list.Add(1);

            List<string> list2 = new List<string>();
            list2.Add("sss");

            List<Employee> employees = new List<Employee>();
            employees.Add(new Employee { EmpNo = 1, Name = "Ankit" });
            employees.Add(new Employee { EmpNo = 2, Name = "Raj" });

            foreach (int item in list)
            {
                Console.WriteLine(item);
            }
            foreach (Employee e in employees)
            {
                Console.WriteLine(e.Name);
            }
        }

        static void Main6()
        {
            SortedList<int, Employee> emps = new SortedList<int, Employee>();
            emps.Add(1, new Employee { EmpNo = 1, Name = "Ankit" });
            emps.Add(2, new Employee { EmpNo = 2, Name = "Raj" });
            foreach (KeyValuePair<int, Employee> item in emps)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value.Name);
            }
        }

        static void Main()
        {
            Stack<int> stack = new Stack<int>();
            stack.Push(1);
            Console.WriteLine(stack.Peek());
            Console.WriteLine(stack.Pop());

            Queue<int> queue = new Queue<int>();
            queue.Enqueue(1);
            Console.WriteLine(queue.Peek());
            Console.WriteLine(queue.Dequeue());
        }

    }
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}

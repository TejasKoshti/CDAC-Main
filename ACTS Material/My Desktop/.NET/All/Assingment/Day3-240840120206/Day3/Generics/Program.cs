namespace Generics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            MyStack<int> stack = new MyStack<int>(3);
            stack.Push(1);
            stack.Push(2);
            stack.Push(3);
            Console.WriteLine(stack.Pop());
            Console.WriteLine(stack.Pop());
            Console.WriteLine(stack.Pop());
        }
    }

    public class MyStack<T>
    {
        T[] stack;
        public MyStack(int Size)
        {
            stack = new T[Size];
        }
        int Pos = -1;
        public void Push(T i)
        {
            stack[++Pos] = i;    
        }
        public T Pop()
        {
            return stack[Pos--];
        }
    }
}

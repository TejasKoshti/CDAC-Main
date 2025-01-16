namespace NullableTypes
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string? s;
            s = null;
            Console.WriteLine("s : "+s);

            int? i;
            i = null;

            int j;

            if(i != null)
            {
                j = (int)i;
            }
            else
            {
                j = 0;
            }

            if(i.HasValue)
            {
                j = i.Value;
            }
            else
            {
                j = 0;
            }

            j = i.GetValueOrDefault();
            Console.WriteLine(j);

            j = i.GetValueOrDefault(10);
            Console.WriteLine(j);

            j = i ?? 11;
            Console.WriteLine(j);

        }
        static void NullableRefTypes()
        {
            string s;
            s = Console.ReadLine();
        }
    }
}

//j = i ?? 11;
//What it does:
//The nullish coalescing operator (??) checks if the value on the left (i in this case) is null or undefined.
//If i is not null or undefined, it assigns the value of i to j.
//If i is null or undefined, it assigns the right-hand value (0 here) to j.
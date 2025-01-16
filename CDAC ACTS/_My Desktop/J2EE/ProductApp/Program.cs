using System;
using System.IO;

namespace ProductApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Product Details:");
            
            Console.Write("Product ID: ");
            int id = int.Parse(Console.ReadLine());
            
            Console.Write("Product Name: ");
            string name = Console.ReadLine();
            
            Console.Write("Product Price: ");
            decimal price = decimal.Parse(Console.ReadLine());
            
            Console.Write("Product Quantity: ");
            int quantity = int.Parse(Console.ReadLine());

            Product product = new Product
            {
                Id = id,
                Name = name,
                Price = price,
                Quantity = quantity
            };

            SaveProductToFile(product);
            
            Console.WriteLine("Product details saved successfully!");
        }

        static void SaveProductToFile(Product product)
        {
            string filePath = "products.txt";
            string productDetails = $"{product.Id},{product.Name},{product.Price},{product.Quantity}";
            
            using (StreamWriter writer = new StreamWriter(filePath, true))
            {
                writer.WriteLine(productDetails);
            }
        }
    }

    class Product
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Price { get; set; }
        public int Quantity { get; set; }
    }
}

using Microsoft.CodeAnalysis.Operations;
using Microsoft.Data.SqlClient;

namespace WebApplication3.Models
{
    public class Employee
    {
        public int Id { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }


        public static List<Employee> GetAll()
        {
            List<Employee> employees = new List<Employee>();
            using (SqlConnection con = new SqlConnection("Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=EmpDb;Integrated Security=True;"))
            {
                con.Open();
                string query = "select * from Employee";
                SqlCommand cmd = new SqlCommand(query, con);
                SqlDataReader reader = cmd.ExecuteReader();
                List<Employee> emp = new List<Employee>();
                while (reader.Read())
                {
                    Employee employee = new Employee();
                    employee.Id = reader.GetInt32(0);
                    employee.Name = reader.GetString(1);
                    employee.Basic = reader.GetDecimal(2);
                    employee.DeptNo = reader.GetInt32(3);
                    employees.Add(employee);
                }
                return employees;
            }
        }

        public static Employee GetDetails(int id)
        {
            using (SqlConnection con = new SqlConnection("Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=EmpDb;Integrated Security=True;"))
            {
                con.Open();
                SqlCommand sqlCommand = new SqlCommand($"select * from Employee where Id={id}", con);
                SqlDataReader reader = sqlCommand.ExecuteReader();

                Employee employee = new Employee();
                while (reader.Read())
                {
                    employee.Id = reader.GetInt32(0);
                    employee.Name = reader.GetString(1);
                    employee.Basic = reader.GetDecimal(2);
                    employee.DeptNo = reader.GetInt32(3);
                }
                return employee;

            }
        }


        public static void AddEmployee(Employee employee) 
        {
            using (SqlConnection con = new SqlConnection("Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=EmpDb;Integrated Security=True;"))
            {
                con.Open();
                SqlCommand cmd = new SqlCommand($"insert into Employee values({employee.Id}, '{employee.Name}', {employee.Basic}, {employee.DeptNo})", con);
                cmd.ExecuteNonQuery();
            }
        
        
        
        }

        public static void UpdateEmployee(int id, Employee employee)
        {
            using (SqlConnection con = new SqlConnection("Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=EmpDb;Integrated Security=True;"))
            {
                con.Open();
                SqlCommand cmd = new SqlCommand($"update Employee set Id={employee.Id}, Name='{employee.Name}',Basic={employee.Basic},DeptNo={employee.DeptNo} where Id={id}", con);
                cmd.ExecuteNonQuery();
            }
        }
        public static void DeleteEmployee(int id)
        {
            using (SqlConnection con = new SqlConnection("Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=EmpDb;Integrated Security=True;"))
            {
                con.Open();
                SqlCommand cmd = new SqlCommand($"delete from Employee where Id={id}", con);
                cmd.ExecuteNonQuery();
            }
        }

    }
    }
   


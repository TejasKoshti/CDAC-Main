const mysql = require("mysql2");

const con = mysql.createConnection({
  port: 3306,
  host: "localhost",
  user: "naushad",
  password: "naushad",
  database: "cdac_pune",
});

con.connect((err) => {
  if (err) throw err;
  console.log("Connection Established");
});

let sql_db = "create database if not exists cdac_pune";
con.query(sql_db, (err, result) => {
  if (err) throw err;
  console.log(result);
  console.log("DATABASE Created");
});

let sql_tb =
  "CREATE TABLE IF NOT EXISTS customers (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), address VARCHAR(255))";
con.query(sql_tb, (err, result) => {
  if (err) throw err;
  console.log("Table Customer created Successfully");
});
module.exports = con;

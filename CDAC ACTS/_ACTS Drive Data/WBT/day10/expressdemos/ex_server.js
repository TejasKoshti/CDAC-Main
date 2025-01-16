var express = require("express");
var app = express();
app.use(express.json());
var routes = require("./myRoutes");
app.use(express.urlencoded({ extended: false }));
//http://localhost:2222/rt/fname/nau/lname/akhtar
app.use("/rt", routes);

// app.get("/", (req, res) => {
//   res.send("<h1>Welcome to Express Server GET 1");
// });
// app.get("/b", (req, res) => {
//   res.send("<h1>Welcome to Express Server GET 2");
// });
// app.post("/", (req, res) => {
//   res.send("<h1>Welcome to Express Server POST 1");
// });
// app.post("/a", (req, res) => {
//   res.send("<h1>Welcome to Express Server POST 2");
// });
// app.put("/", (req, res) => {
//   res.send("<h1>Welcome to Express Server PUT 1");
// });
// app.delete("/", (req, res) => {
//   res.send("<h1>Welcome to Express Server DELETE 1");
// });
// app.all("/", (req, res) => {
//   res.send("<h1>Welcome to Express Server ALL 1");
// });

app.listen(2222);
console.log("Server started");

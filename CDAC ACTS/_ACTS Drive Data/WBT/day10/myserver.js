const http = require("http");
const fs = require("fs");
http
  .createServer((request, response) => {
    fs.readFile("index.html", "utf8", (err, data) => {
      response.write(data);
      response.end();
    });
  })
  .listen(4444);

console.log("Server started at 4444");

const http = require("http");
const fs = require("fs");
http
  .createServer((request, response) => {
    url = request.url;
    if (url == "/") {
      fs.readFile("index.html", "utf8", (err, data) => {
        response.write(data);
        response.end();
      });
    }
    if (url == "/registerform") {
      fs.readFile("forms.html", "utf8", (err, data) => {
        response.write(data);
        response.end();
      });
    }
  })
  .listen(4444);

console.log("Server started at 4444");

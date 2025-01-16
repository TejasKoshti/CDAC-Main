const http = require("http");
const fs = require("fs");
const url = require("url");
http
  .createServer((request, response) => {
    if (request.url == "/") {
      fs.readFile("index.html", "utf8", (err, data) => {
        response.write(data);
        response.end();
      });
    }
    if (request.url == "/registerform") {
      fs.readFile("forms.html", "utf8", (err, data) => {
        response.write(data);
        response.end();
      });
    }
    //verify?uname=Naushad
    if (request.url.startsWith("/verify")) {
      console.log("asdfasdf");
      q = url.parse(request.url, true).query;
      response.write(`<h1>Welcome  ${q.uname} </h1>`);
      response.end();
    }
  })
  .listen(3333);

console.log("Server started at 3333");

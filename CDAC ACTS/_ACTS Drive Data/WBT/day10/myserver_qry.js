const http = require("http");
const fs = require("fs");
const url = require("url");
http
  .createServer((request, response) => {
    fs.readFile("index.html", "utf8", (err, data) => {
      purl = url.parse(request.url, true);
      // console.log(purl);
      q = purl.query;
      console.log(q.uname);
      console.log(q.city);
      response.write("User Name : ");
      response.end();
    });
  })
  .listen(4444);

console.log("Server started at 4444");
// http://localhost:4444/?uname=naushad

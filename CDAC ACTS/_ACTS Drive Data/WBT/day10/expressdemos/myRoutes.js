var express = require("express");
var router = express.Router();
router.use(express.json());
router.get("/", (req, res) => {
  res.sendFile(__dirname + "/index.html");
});
router.get("/display", (req, res) => {
  ff = req.query.fname;
  res.send("Display page " + ff);
});

router.get("/fname/:fname/lname/:lname", (req, res) => {
  res.send(
    "<h1>Welcome to Express Server GET 1" +
      req.params.fname +
      " " +
      req.params.lname
  );
});
router.get("/b", (req, res) => {
  res.send("<h1>Welcome to Express Server GET 2");
});
// router.post("/:idd", (req, res) => {
//   res.send("<h1>Welcome to Express Server POST 1" + req.params.idd);
// });
router.post("/display", (req, res) => {
  const { fname } = req.body;
  console.log({ fname });
  res.send("<h1>Welcome to Express Server POST 2");
});
router.put("/", (req, res) => {
  res.send("<h1>Welcome to Express Server PUT 1");
});
router.delete("/", (req, res) => {
  res.send("<h1>Welcome to Express Server DELETE 1");
});
router.all("/", (req, res) => {
  res.send("<h1>Welcome to Express Server ALL 1");
});

module.exports = router;

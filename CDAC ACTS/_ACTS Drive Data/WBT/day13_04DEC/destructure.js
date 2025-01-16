let Employee = require("./Employee");

let arr = [2, 1, 4];
let [a, b, c] = arr;
//console.log(c);
let num = [2, 1, 3, 5, 6, 7, 8];
let [a1, a2] = num;
let [a3, b1, , , ...rest] = num;
console.log(rest);
let emp = { id: 1, name: "naushad" };
let { id, name } = emp;
console.log(name, id);
function sum(...nums) {
  return nums;
}
ans = sum(...num);
console.log(ans);
let obj = [
  { id: 1, name: "akhtar", city: "mumbai", town: "pashan" },
  { id: 2, name: "akhtar", city: "mumbai" },
];

Employee = obj;

console.log(Employee);

// let updateObject = { ...obj, city: "pune" };
// console.log(updateObject);
// console.log(obj);

var x = 30;

y = () => {
  this.id = 40;
  console.log(this.id);
};
console.log(y.id);

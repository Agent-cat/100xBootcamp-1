const values = [2, 3, 4, 5, 6, 7];

const data = values.filter((n) => {
  return n % 2 == 0;
});
console.log(data);

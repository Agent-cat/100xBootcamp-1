/*
Write an if/else statement that checks if a number is even or odd. If it's even, print "The number is even." Otherwise, print "The number is odd."
*/

const OddEven = (num) => {
  if (num % 2 == 0) {
    console.log("Even");
  } else {
    console.log("Odd");
  }
};
OddEven(11);

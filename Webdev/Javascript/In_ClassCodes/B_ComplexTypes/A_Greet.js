/*
Write a function that takes a user as an input and greets them with their name and age
*/
const Greet = (User) => {
  console.log(`Welcome ${User.name},Your age is ${User.age}`);
};

const User = {
  name: "Vishnu ",
  age: 20,
};
Greet(User);

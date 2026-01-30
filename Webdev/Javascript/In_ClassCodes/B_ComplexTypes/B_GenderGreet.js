/*
Write a function that takes a new object as input which has name , age  and gender and greets the user with their gender (Hi Mr/Mrs/Others harkirat, your age is 21)
*/

const GenderGreet = (User) => {
  console.log(
    `Welcome ${User.gender == "male" ? "Mr" : "Ms"} ${User.name} , Your Age is ${User.age}`,
  );
};

const User = {
  name: "Vishnu",
  age: 20,
  gender: "male",
};
GenderGreet(User);

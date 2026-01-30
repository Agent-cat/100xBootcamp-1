/*
Write a function that takes an array of users as inputs and returns only the users who are more than 18 years old
*/

const MoreThan = (Users) => {
  console.log(
    Users.filter((user) => {
      return user.age > 18;
    }),
  );
};

const Users = [
  {
    name: "Harkirat",
    age: 21,
  },
  {
    name: "raman",
    age: 12,
  },
  {
    name: "Vishnu",
    age: 22,
  },
  {
    name: "arsha",
    age: 22,
  },
];

MoreThan(Users);

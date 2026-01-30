const LegalToVote = (User) => {
  console.log(User.age > 18 ? "Yes" : "No");
};

const User = {
  name: "Vishnu",
  age: 20,
  gender: "male",
};
LegalToVote(User);

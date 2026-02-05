// const GITHUB_URI = "https://api.github.com/users/Agent-cat";
// const Users = fetch(GITHUB_URI);
// console.log(Users); // Promise { <pending> } --> it logs this
// Users.then((data) => {
//   return data.json();
// }).then((userData) => {
//   console.log(userData);
// });

//==============================================================================================================

const promise1 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("This is promise1");
  }, 2000);
});

// promise1.then((data) => {
//   console.log(data); //it takes two secons to log this
// });

const promise2 = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("This is Promise2");
  }, 4000);
});

// promise2.then((data) => {
//   console.log(data); // it takes four seconds to log this
// });

// Promise.all([promise1, promise2]).then((results) => {
//   console.log(results); // This prints after completion of both the promises
// });

Promise.any(
  [promise1, promise2].map((prom) => {
    prom.then((res) => {
      console.log(res);
    });
  }),
);

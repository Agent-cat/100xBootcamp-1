const fs = require("fs");

// It Reads files Synchronously
const content = fs.readFileSync("vishnu.txt", "utf-8");
console.log(content);
// It reads file asynchronously-(it needs a callback)
fs.readFile("vishnu.txt", "utf-8", (err, cont) => {
  console.log(cont);
});
//appends into an existing file
fs.appendFile("vishnu.txt", "hi my name is vishnu", (err) => {
  if (err) {
    throw new Error("Error");
  }
});
// Creates a file and write into it
fs.writeFile("vishnuvardhan.txt", "hello my name is vishu", (err) => {
  if (err) throw new Error("Error");
});
fs.copyFile("vishnu.txt", "vishnuvardhan.txt", () => {
  console.log("file copyed");
});

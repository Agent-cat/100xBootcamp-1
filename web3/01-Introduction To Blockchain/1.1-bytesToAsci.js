const bytesToAsci = (bytes) => {
  return bytes.map((byte) => String.fromCharCode(byte)).join("");
};

const bytes = [72, 101, 108, 108, 111];
const bytesString = bytesToAsci(bytes);
console.log(bytesString); //Hello

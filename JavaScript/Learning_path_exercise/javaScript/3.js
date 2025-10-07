const user = { info: { name: "Alice", age: 25 } };

const { info } = user;

info.age = 30;

console.log(user.info.age);
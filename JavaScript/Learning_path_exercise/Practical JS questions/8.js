// Write a JavaScript function that takes an array of user objects. Each object contains a scores array. The function should return a single flattened array containing all scores from all users.

// const users = [
//   { name: "Alice", scores: [10, 20, 30] },
//   { name: "Bob", scores: [40, 50] },
//   { name: "Charlie", scores: [60, 70] }
// ];

// // Output: [10, 20, 30, 40, 50, 60, 70]

function flattt(users){
    let result=[]
    for (a of users){
        result.push([a["scores"]])
    }
    return result.flat(Infinity)
}

const users = [
  { name: "Alice", scores: [10, 20, 30] },
  { name: "Bob", scores: [40, 50] },
  { name: "Charlie", scores: [60, 70] }
];

console.log(flattt(users))
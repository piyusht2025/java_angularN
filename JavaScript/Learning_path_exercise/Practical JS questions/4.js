// Write a function that takes an array of objects and a key, and returns a new array sorted by the values of that key in ascending order.

// const users = [
//   { name: "Alice", age: 30 },
//   { name: "Bob", age: 25 },
//   { name: "Charlie", age: 35 }
// ];


// sortByKey(users, "age");
// // Output: [
// //   { name: "Bob", age: 25 },
// //   { name: "Alice", age: 30 },
// //   { name: "Charlie", age: 35 }
// // ]


function sortByKey(users, keyss) {
    let sortedValue = []
    let newArr = []
    let i = 0
    for (arr of users) {
        sortedValue.push(arr["age"])
        //console.log(sortedValue)
    }
    sortedValue.sort((a, b) => a - b)
    //console.log(sortedValue);
    while (i < sortedValue.length) {
        for (arr of users) {
            if (arr[keyss] === sortedValue[i]) {
                newArr.push(arr)
                i+=1
            }
        }
    }
    return newArr;

}

const users = [
    { name: "Alice", age: 30 },
    { name: "Bob", age: 25 },
    { name: "Charlie", age: 35 }
];
console.log(sortByKey(users, "age"))
// Write a function that takes an array of integers and returns a new array containing only the unique elements.

// getUniqueElements([1, 2, 2, 3, 4, 4, 5]);
// // Output: [1, 2, 3, 4, 5]

function getUniqueElements(arr){
    let s = new Set([...arr])
    let arr1=[...s]
    return arr1;

}
console.log(getUniqueElements([1, 2, 2, 3, 4, 4, 5]));
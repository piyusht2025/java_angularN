// Write a function that takes an array of numbers and returns an object containing the largest and smallest numbers.

// findMinMax([10, 5, 8, 1, 20]);
// // Output: { min: 1, max: 20 }


// Write a function that takes an array of numbers and returns the sum of all the elements.

// sumArray([1, 2, 3, 4, 5]);
// // Output: 15



function findMinMax(arr) {
    if (!Array.isArray(arr)) {
        return { 'min': 0, 'max': 0 }
    }

    let maxi = arr[0]
    let small = arr[0]
    for (a of arr) {
        if (a > maxi) {
            maxi = a
        }
        if (a < small) {
            small = a
        }
    }
    return { 'min': small, 'max': maxi }
}
console.log(findMinMax([10, 5, 8, 1, 20]))





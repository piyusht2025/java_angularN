// 10: Spread and Rest Operators

// Write a function sum that takes any number of arguments and returns the sum of all the arguments using the rest parameter and the spread operator.


function sum(...arr){
    let s=0;
    for (let a of arr){
        s+=a;
    }
    return s;
}

arr=[1,2,3,4,5]
console.log("sum = ",sum(...arr))
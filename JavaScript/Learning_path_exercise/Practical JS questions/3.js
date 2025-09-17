// Write a function that converts a string to title case, capitalizing the first letter of each word.

// toTitleCase("hello world from javascript");

function toTitleCase(str){
    let arr;
    let newStr=""
    if (typeof str === typeof ''){
        arr=str.split(" ")
        for (a of arr){
            newStr = newStr + a[0].toUpperCase() +a.slice(1)+" ";
        }
        return newStr;
    }
    console.error("Enter a vallid String")
}

console.log(toTitleCase("hello world from javascript"))
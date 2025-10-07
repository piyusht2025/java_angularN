
// 3: Promises

// Write a function fetchData that returns a promise. The promise should resolve with the string "Data fetched successfully!" after a delay of 2 seconds.

function fetchData(){
    return new Promise(
        (resolve,reject)=>
            (setTimeout(() => resolve("Data Fetched Succesfully"), 2000)))
}

fetchData()
    .then((p)=>console.log(p))

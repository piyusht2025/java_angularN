// 8: Async/Await

// Write an asynchronous function getData that fetches data from an API using fetch. Use async/await to handle the asynchronous operation and return the parsed JSON response.


let url= "https://jsonplaceholder.typicode.com/todos/1"

async function getData(url2) {
    let str=await fetch(url2)
    // console.log("fetched")
    let a=await str.json()
    console.log(a)
    return a
}

let b= getData(url)

b.then((r)=>console.log(r))



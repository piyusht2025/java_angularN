// Write a function called counter that returns another function. The returned function should increment a counter each time it is called. Implement both functions.

let count=0

function counter(){
    return secondCounter;
}

function secondCounter(){
    count+=1;
}

for (let i=0;i<10;i++){
    counter()()
    console.log(count)
}
// 9: Scope and Closure

// Write a function counterFactory that returns an object with two methods: increment and getCount. The increment method should increase a counter, and the getCount method should return the current count.


let count=0

function counterFactory(){
    function increment(){
        count +=1
    }
    function getCount(){
        return count
    }

    return {"inc":increment,"counter":getCount}

}

let cf = counterFactory()

cf["inc"]()
console.log("Counter = ",cf["counter"]());


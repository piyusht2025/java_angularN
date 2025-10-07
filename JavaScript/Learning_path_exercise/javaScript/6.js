
const a = { name: "test" };

const b = { name: "test" };

class ObjectA{
    constructor(name){this.name=name}
 
}

const obj1 = new ObjectA("Piyush")
const obj2 = new ObjectA("Piyush")
const map = new Map();

map.set(obj1, 123);

map.set(obj2, 456);

console.log(map);
// console.log(typeof a)
// console.log(typeof { name: "test" })
// map.delete(a)
// console.log(map);


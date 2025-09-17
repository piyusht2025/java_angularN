// Parse a JSON string into a JavaScript object and stringify an object back to a JSON string.


let str="{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}"

let a = JSON.parse(str)

console.log(typeof a ," ", a);

let j=JSON.stringify(a);

console.log(typeof j , " " , j);


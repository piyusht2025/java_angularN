// const x = 1;
// function outer() {
//     const x = 2;
//     function inner() {
//         const x = 3;
//         console.log(x);
//     }
//     inner();
//     console.log(x);
// }
// outer();
// console.log(x);

// What about with let/const?
let y = 10;
if (true) {
    let y = 20;
    console.log(y);
}
console.log(y);

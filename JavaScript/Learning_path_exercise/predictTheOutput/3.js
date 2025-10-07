function wrap(a){
    return function(b){
        console.log(a.a+b.b);
        return a;
    }
}
const b={a:5,b:12}
const wrap1=wrap({a:10})
let a= wrap1(b)
console.log(a);
a.a=2;
wrap1(b)
// b.b=15
// wrap1(b)
// a={}
// wrap1(b);

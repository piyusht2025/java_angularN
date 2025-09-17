// class Parent {

//   constructor() {

//     this.say = () => console.log('Parent');

//   }

// }

// class Child extends Parent {

//   constructor() {

//     super();

//     this.say = () => console.log('Child');

//   }
//    a=10;
//    fn(params) {
//     console.log(params);
//   }
// }
class Parent {
  say(){
    console.log('Parent')
  }

}

class Child extends Parent {
  constructor() {
super();
}
   say(){
    console.log('Child');
    
   }
}

const p = new Parent();

const c = new Child();

p.say();

c.say();

function counter() {
  let a = 0;
  return function innerCounter(input) {
    var b = input;
    return function () {
      a++
      b++;
      return {
        global: a,
        local: b
      };
    };
  };
}

const _counter  = counter();
const counterA = _counter(10);
const counterB = _counter(20);
console.log(counterA());
console.log(counterB());
console.log(counterA());
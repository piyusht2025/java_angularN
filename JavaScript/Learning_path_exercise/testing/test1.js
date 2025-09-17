const x = 10;

function foo() {
    console.log(x);
}

function bar() {
    const x = 20;
    return foo;
}

bar()(); 
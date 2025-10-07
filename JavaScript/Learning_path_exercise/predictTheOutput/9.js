function first() {
    console.log('First');
}
function second() {
    setTimeout(() => console.log('Second'), 0);
}
function third() {
    Promise.resolve().then(() => console.log('Third'));
}

first();
second();
third();
console.log('Fourth');
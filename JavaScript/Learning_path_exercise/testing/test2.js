function doSomethingAsync(callback) {
  setTimeout(() => {
    console.log("Async operation completed.");
    callback();
  }, 2000);
}

console.log("Start");
doSomethingAsync(() => {
  console.log("Callback executed.");
});
console.log("End");
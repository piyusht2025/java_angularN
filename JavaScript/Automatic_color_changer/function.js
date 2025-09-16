let random;
let hex = '0123456789ABCDEF';
function newHex() {
  random = '#';
  for (let i = 0; i < 6; i++) {
    random += hex[Math.floor(Math.random() * 16)];
  }

  return random;
}

const start = document.querySelector('#start');
const stop = document.querySelector('#stop');
let newInterval;

const st = start.addEventListener('click', function () {
  newInterval = setInterval(function () {
      document.body.style.backgroundColor = newHex();
    }, 1000);
});

const stp = stop.addEventListener('click', function () {
  clearInterval(newInterval);
  
});

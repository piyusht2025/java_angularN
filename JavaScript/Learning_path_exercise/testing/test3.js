function fetchData() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const data = "Fetched data";
      // resolve(data); // Uncomment this line to resolve the promise
      reject("Error: Unable to fetch data");
    }, 1000);
  });
}

fetchData()
  .then(response => console.log(response))
  .catch(error => console.error(error));
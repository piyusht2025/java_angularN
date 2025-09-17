// Write a function that takes two dates as strings ("YYYY-MM-DD") and returns the number of days between them.

// getDateDifference("2025-07-01", "2025-07-25");
// // Output: 24


function getDateDifference(d1,d2){
    let date1=new Date(d1)
    let date2=new Date(d2)
    let diff=date2-date1;
    console.log(diff/(1000 * 60 * 60 * 24));
    
}

getDateDifference("2025-07-01", "2025-07-25");
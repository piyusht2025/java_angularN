
// Write a function that checks if a given string is a palindrome (a word or phrase that reads the same forwards and backwards, ignoring case).

// isPalindrome("madam");
// // Output: true


// isPalindrome("hello");
// // Output: false


function isPalindrome(str) {
    if (typeof str === typeof "") {
        let str2 = str.toLowerCase()
        for (let i = 0; i < Math.floor((str.length/2)); i++) {
            if(str2[i]!==str2[str.length-i-1]){
                return false
            }
        }
        return true
    }
    console.error("Enter a String ")

}
console.log(isPalindrome("maamam"))
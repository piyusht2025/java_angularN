const cart=["Shirt","pant","Shoes"]
console.log("hello")
function createOrder(){
    return new Promise(function(resolve,reject){
        if(!validateCart()){
            let err = new Error("Error Wrong Cart")
            reject(err)
        }
        let orderid=12345
        resolve(orderid)
    })
}

function validateCart(){
    return true
}


function proceedToPayment(){
    return new Promise(function(resolve,reject){
        resolve("Successfull")
    })
}

let pr=createOrder(cart)
    pr
    .then(function(orderid){
        console.log(orderid)
        return proceedToPayment(orderid)
    })
    .then(function(a){
        console.log(a)
    })
    .catch(function(err){
        console.log(err.message)
    })
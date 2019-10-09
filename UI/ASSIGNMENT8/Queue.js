// Constructor for Queue
function Queue(){
    this.elements = [];
}
// Adding enqueue method 
Queue.prototype.enqueue=function(element){
    this.elements.push(element);
};
// Adding dequeue method 
Queue.prototype.dequeue=function(){
    return this.elements.shift();
};
// Adding isEmpty method 
// Return true if queue is empty otherwise false
Queue.prototype.isEmpty = function () {
    return this.elements.length == 0;
};

console.log("Queue");
//inserting data
var obj1=new Queue();
console.log(obj1.isEmpty());
obj1.enqueue(1);
console.log(obj1.isEmpty());
obj1.enqueue(2);
obj1.enqueue(3);
obj1.enqueue(4);
while (!obj1.isEmpty()) {
    console.log(obj1.dequeue());
}
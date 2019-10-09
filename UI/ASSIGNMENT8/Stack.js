// Constructor for Stack
function Stack(){
    this.elements = [];
}
// Adding push method
Stack.prototype.push=function(element){
    this.elements.push(element);
};
// Adding pop method
// Return top of stack and remove it 
Stack.prototype.pop=function(){
    return this.elements.pop();
};
// Adding isEmpty method 
// Return true if stack is empty otherwise false
Stack .prototype.isEmpty = function () {
    return this.elements.length == 0;
};
console.log("Stack");
//inserting data
var obj1=new Stack();
console.log(obj1.isEmpty());
obj1.push(1);
console.log(obj1.isEmpty());
obj1.push(2);
obj1.push(3);
obj1.push(4);
while (!obj1.isEmpty()) {
    console.log(obj1.pop());
}
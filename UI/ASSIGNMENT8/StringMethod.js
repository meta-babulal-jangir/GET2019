// adding a prototype 
String.prototype.repeatify=function(repeatTime){
    var resultString="";
    for(var i=0;i<repeatTime;i++){
        resultString+=this.toString();
    }
    return resultString;
}
console.log("hello".repeatify(4));
var vehicleType;
var password;

function next(){
    var employeeName = document.getElementById("inputValue").value;
    var regexp = /^[a-zA-Z]+$/;
    if(regexp.test(employeeName)){
        document.getElementById("label").innerHTML="Hi "+ employeeName + "!" +" Enter Your Email ";
        document.getElementById("inputValue").type = "email";
        document.getElementById("inputValue").value="";
        document.getElementById("linkButton").onclick = next1;
    }
    else{
        alert("Name Must be Proper !");
    }
}

function next1(){
    var email = document.getElementById("inputValue").value;
    var regexp = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if(regexp.test(email)){
       document.getElementById("label").innerHTML="Enter Your Password !";
       document.getElementById("inputValue").type = "password";
       document.getElementById("inputValue").value="";
       document.getElementById("linkButton").onclick = next2;
    }else{
        alert("Email Format is not Correct !");
    }
}

function next2(){
    password = document.getElementById("inputValue").value;
    if (password.match(/[a-z]/g) && password.match( 
        /[A-Z]/g) && password.match( 
        /[0-9]/g) && password.match( 
        /[^a-zA-Z\d]/g) && password.length >= 8){ 
    
            document.getElementById("label").innerHTML="Please Confirm Your Password !";
            document.getElementById("inputValue").type = "password";
            document.getElementById("inputValue").value="";
            document.getElementById("linkButton").onclick = next3;
        }
        else{
            alert('Password Must Contain following\nAt least 1 uppercase character\nAt least 1 lowercase character\nAt least 1 digit\nAt least 1 special character\nMinimum 8 characters');
        }
}

function next3(){
  var repass = document.getElementById("inputValue").value;
  if(password != repass){
     alert("Password Doesn't Match!");
  }else{
     document.getElementById("label").innerHTML="Enter Your Contact Number!";
     document.getElementById("inputValue").type = "tel";
     document.getElementById("inputValue").value="";
     document.getElementById("linkButton").onclick = next4;
  }
 }

 function next4(){
    var contactNumber = document.getElementById("inputValue").value;
    var regexp = /^\d{10}$/;
    if(regexp.test(contactNumber)){
        document.body.style.background = "gray";
        document.getElementById("label").innerHTML="Enter your vehicle number!";
        document.getElementById("inputValue").type = "input";
        document.getElementById("inputValue").value="";
        document.getElementById("linkButton").onclick = next5;
    }else{
        alert("Contact Number Format is not Correct !");
    }

 }

 function next5(){
    
    var vehicleNumber = document.getElementById("inputValue").value;
    var regexp = /^[A-Z]{2}\s[0-9]{2}\s[A-Z]{2}\s[0-9]{4}$/;
    if(regexp.test(vehicleNumber)){
        document.getElementById("label").innerHTML="What is Your Vehicle Type [Cycle/MotorCycle/FourWheeler] ?";
        document.getElementById("inputValue").type = "text";
        document.getElementById("inputValue").value="";
        document.getElementById("linkButton").onclick = next6;
    }else{
        alert("Vehicle Number Format is not Correct !\nlike MP 09 AB 1234");
    }
 }
 
 function next6(){
    var vehicleType = document.getElementById("inputValue").value;
    if(vehicleType=='Cycle' || vehicleType=='MotorCycle' || vehicleType=='FourWheeler'){
        
        document.getElementById("label").innerHTML = "Enter Your Employee Id!";
        document.getElementById("inputValue").type = "id";
        document.getElementById("inputValue").value="";
        document.getElementById("linkButton").onclick = next7;
    }else{
        alert("Vehicle Type must be [Cycle/MotorCycle/FourWheeler]");
    }
 }

 function next7(){
    var emplyeeId = document.getElementById("inputValue").value;
    if(emplyeeId){ 
        document.body.style.background = "DarkSeaGreen";
        if("Cycle" == vehicleType){
            document.getElementById("label").innerHTML="Choose Your Pass[5 Daily/100 Monthly/500 Yearly]!";
        }else if("MotorCycle" == vehicleType){
            document.getElementById("label").innerHTML="Choose Your Pass[10 Daily/200 Monthly/1000 Yearly]!";
        }else{
            document.getElementById("label").innerHTML="Choose Your Pass[20 Daily/500 Monthly/3500 Yearly]!";
        }

        document.getElementById("inputValue").type = "text";
        document.getElementById("inputValue").value="";
        document.getElementById("linkButton").onclick = next8;
    }else{
        alert("Employee ID Format is not Correct !");
    }
 }

 function next8(){
     var pass = document.getElementById("inputValue").value;
     document.getElementById("field").innerHTML=" Your pass price is " + pass +"  !!!!!";
     document.getElementById("field").style.animation = "end 6s";
     document.body.style.background = "RosyBrown";
 }
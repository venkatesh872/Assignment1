function validate(){
    let username= document.getElementById("username");
    let password= document.getElementById("password");

    if(username.value.trim() =="" || password.value.trim()==""){
        alert("No blank values allowed");
        return false;
    }
    else{
        alert("successfully");
        return true;
    }
}
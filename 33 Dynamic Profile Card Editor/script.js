function updateName(thisID, targetID){
    let targetElement = document.getElementById(thisID);
    let sourceValue = document.getElementById(targetID).value;
    
    if (sourceValue) {
        targetElement.innerText = sourceValue;
        displayMessage(true);
    } else {
        displayMessage(false);
    }
}


function updateProfile(){
    if(document.getElementById("update_img_url").value){
        document.getElementById("user_profile").src = document.getElementById("update_img_url").value;
        displayMessage(true);
    } else {
        displayMessage(false);
    }
}

function updateBG(){
    if(document.getElementById("change_bg").value){
        document.getElementById("profile_card").style.backgroundColor = document.getElementById("change_bg").value;
        displayMessage(true);
    } else {
        displayMessage(false);
    }
}

function displayMessage(status) {
    console.log(status)
    if(status){
        document.getElementById('feedback').innerText = "Changes Applied";
        document.getElementById('feedback').style.display = "block";
        document.getElementById('feedback').style.backgroundColor = "greenyellow";
        setTimeout(() => {
            document.getElementById('feedback').innerText = "";
            document.getElementById('feedback').style.display = "none";
        }, 3000); 
    }else{
        document.getElementById('feedback').innerText = "Failed to apply";
        document.getElementById('feedback').style.display = "block";
        document.getElementById('feedback').style.backgroundColor = "red";
        setTimeout(() => {
            document.getElementById('feedback').innerText = "";
            document.getElementById('feedback').style.display = "none";
        }, 3000); 
    }
}
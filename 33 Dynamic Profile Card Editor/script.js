function updateName(thisID, targetID){
    document.getElementById(thisID).innerText = document.getElementById(targetID).value;
}


function updateProfile(){
    document.getElementById("user_profile").src = document.getElementById("update_img_url").value;
}

function updateBG(){
    document.getElementById("profile_card").style.backgroundColor = document.getElementById("change_bg").value;
}
function updateName(){
    document.getElementById('user_name').innerText = document.getElementById('update_name').value;
}
function updateBio(){
    document.getElementById('user_bio').innerText = document.getElementById('update_bio').value;
}

function updateProfile(){
    document.getElementById("user_profile").src = document.getElementById("update_img_url").value;
}

function updateBG(){
    document.getElementById("profile_card").style.backgroundColor = document.getElementById("change_bg").value;
}

document.getElementById('update_button').addEventListener('click', masterUpdate);

function masterUpdate(){
    updateName();
    updateBio();
    updateProfile();
    updateBG();
}
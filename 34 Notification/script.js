function showNotif(){
    let notif_container = document.getElementById("notif_container_list");
    let newNotifList = document.createElement('li');
    let closeButton = document.createElement('button')

    newNotifList.innerHTML = `"You have a new message!"`
    notif_container.appendChild(newNotifList);
    newNotifList.appendChild(closeButton);
    closeButton.innerText = ` X `
    closeButton.onclick = () => removeNotif(newNotifList);
    setTimeout(() => {
        removeNotif(newNotifList);
    }, 5000);
}

function removeNotif(removeThis) {
    let notif_container = document.getElementById("notif_container_list");
    if(removeThis){
        notif_container.removeChild(removeThis);
    }
}



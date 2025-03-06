var todoContainer = document.getElementById("todo_list_container");

document.getElementById("add_task_button").addEventListener('click', function () {
    var taskInput = document.getElementById("task_input");
    if (taskInput.value) {
        let newList = document.createElement('li');
        let newListRemoveButton = document.createElement('button');
        let newListTODOvalue = document.createElement('span')
        newListTODOvalue.innerText = taskInput.value;
        newList.appendChild(newListTODOvalue);

        newList.appendChild(newListRemoveButton);
        newListRemoveButton.innerText = ` Remove `

        //adding of new todo list
        todoContainer.appendChild(newList)
        taskInput.value = '';
        notification(true);

        //removing of todo list
        newListRemoveButton.onclick = () => {
            notification(false);
            removeTodo(newList);
        }

        // toggling todo list 
        let isDone = false;
        newList.addEventListener('click', () => {
            isDone = !isDone;
            if (isDone) {
                newList.style.backgroundColor = 'lightgreen';
                newListTODOvalue.style.textDecoration = 'line-through';
            } else {
                newList.style.backgroundColor = '#dbeef4';
                newListTODOvalue.style.textDecoration = 'none';

            }
        });
    } else {
        alert('Please add a todo')
    }
});

function removeTodo(removeThis) {
    if (removeThis) {
        todoContainer.removeChild(removeThis);
    }
}

function notification(isAdded) {
    let notif_container = document.getElementById("notif_container_list");
    let newNotifList = document.createElement('li');
    let closeButton = document.createElement('button')

    newNotifList.innerHTML = isAdded?"TODO added!":"TODO removed."
    notif_container.appendChild(newNotifList);
    newNotifList.appendChild(closeButton);
    closeButton.innerText = `X `
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

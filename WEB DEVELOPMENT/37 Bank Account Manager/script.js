let current_balance = 0;

let current_balance_text = document.getElementById('current_balance_text')
current_balance_text.innerText = ` $${current_balance}`;

let money_input = document.getElementById('balance_input')

document.getElementById('deposit_button').addEventListener('click',()=>{
    if(money_input.value && parseFloat(money_input.value) > 0){
        current_balance += parseFloat(money_input.value);
        current_balance_text.innerText = ` $${current_balance}`;
        money_input.value = '';
        showStatus(true, `Successfully deposited $${current_balance}.`);
    }else{
        money_input.value = '';
        showStatus(false, "Please enter amount.");
        
    }
});
document.getElementById('withdraw_button').addEventListener('click',()=>{
    if(money_input.value && parseFloat(money_input.value) > 0){
        let remaining = current_balance - parseFloat(money_input.value);
        console.log(remaining);
        if(remaining >= 0){
            current_balance -= parseFloat(money_input.value);

            current_balance_text.innerText = current_balance < 1? ` $0`:` $${current_balance}`;
            showStatus(true, `Successfully withdrew $${parseFloat(money_input.value)}.`);
            money_input.value = '';
        }else{
            money_input.value = '';
            showStatus(false, `Insufficient withdraw amount.`);
        }
    }else{
        money_input.value = '';
        showStatus(false, "Please enter amount");
    }
});

let setNotif = document.getElementById('action_notif');
function showStatus(isSuccess, msg) {
    setNotif.style.display = "block";
    setNotif.style.color = isSuccess ? "green" : "red";
    setNotif.innerHTML = msg;

    setTimeout(() => {
        setNotif.style.display = "none";
        setNotif.innerHTML = '';
    }, 5000);
}

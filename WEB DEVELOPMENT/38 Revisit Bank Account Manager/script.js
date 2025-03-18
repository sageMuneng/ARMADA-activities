let current_balance = 0;
let daily_withdrawal = 0;

let current_balance_text = document.getElementById('current_balance_text')
let transaction_history_container = document.getElementById('transaction_history_container')

current_balance_text.innerText = ` $${current_balance}`;

let money_input = document.getElementById('balance_input')

let setNotif = document.getElementById('action_notif');

document.getElementById('deposit_button').addEventListener('click', () => {
    if (money_input.value && parseFloat(money_input.value) > 0) {
        current_balance += parseFloat(money_input.value);
        current_balance_text.innerText = ` $${current_balance}`;
        showStatus(true, `Successfully deposited $${current_balance}.`);

        let add_history = document.createElement('li');
        add_history.innerText = `Deposit: $${money_input.value}`
        transaction_history_container.appendChild(add_history);
        money_input.value = '';
    } else {
        money_input.value = '';
        showStatus(false, "Please enter amount.");

    }
});
document.getElementById('withdraw_button').addEventListener('click', () => {
    if (money_input.value && parseFloat(money_input.value) > 0) {
        let remaining = current_balance - parseFloat(money_input.value);
        if (remaining >= 0) {
            daily_withdrawal += parseFloat(money_input.value);
            console.log(daily_withdrawal);
            if(daily_withdrawal <= 500){
                current_balance -= parseFloat(money_input.value);
    
                current_balance_text.innerText = current_balance < 1 ? ` $0` : ` $${current_balance}`;
                showStatus(true, `Successfully withdrew $${parseFloat(money_input.value)}.`);
    
                let add_history = document.createElement('li');
                add_history.innerText = `Withdraw: $${money_input.value}`
                transaction_history_container.appendChild(add_history);
    
                money_input.value = '';
            }else{
                daily_withdrawal -= parseFloat(money_input.value)
                money_input.value = '';
                showStatus(false, `Daily withdrawal limit reached.`);
            }
        } else {
            money_input.value = '';
            showStatus(false, `Insufficient withdraw amount.`);
        }
    } else {
        money_input.value = '';
        showStatus(false, "Please enter amount");
    }
});

function showStatus(isSuccess, msg) {
    setNotif.style.display = "block";
    setNotif.style.color = isSuccess ? "green" : "red";
    setNotif.innerHTML = msg;

    setTimeout(() => {
        setNotif.style.display = "none";
        setNotif.innerHTML = '';
    }, 5000);
}

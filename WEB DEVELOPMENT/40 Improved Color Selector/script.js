document.body.addEventListener("click", function () {
    document.querySelectorAll(".color-box").forEach(btn => {
        btn.style.border = "none";
    });

    document.body.style.backgroundColor = 'white';
    document.getElementById('container').style.backgroundColor = "lightgray";
    document.getElementById('selected_color_indicator').innerText = `Selected Color: None`;
});

document.querySelectorAll(".color-box").forEach(button => {
    button.addEventListener("click", function (event) {
        event.stopPropagation(); // Uncomment this to see the difference

        // Remove border from all buttons first
        document.querySelectorAll(".color-box").forEach(btn => {
            btn.style.border = "none";
        });

        // then apply border to this button
        this.style.border = "2px solid yellow";

        document.body.style.backgroundColor = this.innerText;
        document.getElementById('container').style.backgroundColor = this.innerText;

        document.getElementById('selected_color_indicator').innerText = `Selected Color: ${this.innerText}`;
    });
});
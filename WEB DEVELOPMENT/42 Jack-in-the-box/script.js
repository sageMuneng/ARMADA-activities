var jackInBox = document.getElementById('boxImg');

var openState = jackInBox.getAttribute('openState');
var closeState = jackInBox.getAttribute('closeState');
var openAnimation = jackInBox.getAttribute('openAnim');
var closeAnimation = jackInBox.getAttribute('closeAnim');

document.getElementById('openBox').addEventListener('click', function() {
    jackInBox.src = openAnimation;
    this.style.transition = "ease-in 0.1s";
    this.style.opacity = '0';
    
    setTimeout(() => {
        jackInBox.src = openState;
        
    }, 4900);
    setTimeout(() => {
        jackInBox.src = closeAnimation;
        setTimeout(() => {
            jackInBox.src = closeState;
            this.style.transition = "ease-in 0.1s";
            this.style.opacity = '1';
        }, 2900);
    }, 7000);

});
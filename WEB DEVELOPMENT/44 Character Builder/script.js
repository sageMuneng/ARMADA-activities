document.getElementById('Arctic_Hood').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "helmet")
});

document.getElementById('Fiery_Helmet').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "helmet")
});

document.getElementById('Arctic_Jacket').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "chestplate")
});

document.getElementById('Fiery_Chestplate').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "chestplate")
});

document.getElementById('Arctic_Leggings').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "leggings")
});

document.getElementById('Fiery_Leggings').addEventListener('click', function(){
    setImage(this.getAttribute("data-part"), "leggings")
});

document.getElementById('Arctic_Boots').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "boots")
});

document.getElementById('Fiery_Boots').addEventListener('click', function() {
    setImage(this.getAttribute("data-part"), "boots")
});

function setImage(src, area) {
    if (area == 'helmet') {
        document.getElementById('helmet').src = src;
    } else if (area == 'chestplate') {
        document.getElementById('chestplate').src = src;

    } else if (area == 'leggings') {
        document.getElementById('leggings').src = src;

    } else if (area == 'boots') {
        document.getElementById('boots').src = src;

    }
}
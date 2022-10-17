var el;

function charCount(e){
    var textEntered, charDisplay, couter, lastkey;
    textEntered = document.getElementById('message').value;
    charDisplay = document.getElementById('charactersLeft');
    couter = (180 -(textEntered.length));
    lastkey = document.getElementById('lastKey');
    lastkey.textContent = 'Last key in ASCII code :' + e.keyCode;
}

el = document.getElementById('message');
el.addEventListener('keyup', charCount, false);
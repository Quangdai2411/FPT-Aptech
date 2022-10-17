function checkUsername(){
    var elMg = document.getElementById('feedback');
    if (elUsername.value.length < 5){
        elMg.textContent = 'User must be 5 characters or more';
    }else {
        elMg.textContent = '';
    }
}

var elUsername = document.getElementById('username');
elUsername.addEventListener('blur', checkUsername, 'false');
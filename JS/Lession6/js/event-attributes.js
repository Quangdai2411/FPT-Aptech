function checkUsername(){
    var elMg = document.getElementById('feedback');
    var elUsername = document.getElementById('username');
    if (elUsername.value.length < 5){
        elMg.textContent = 'User must be 5 characters or more';
    }else {
        elMg.textContent = '';
    }
}
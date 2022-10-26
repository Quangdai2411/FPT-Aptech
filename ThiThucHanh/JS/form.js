function checkUsername(){
    var elMsg = document.getElementById('kiemtra');
    var elUsername = document.getElementById('username');
    if (elUsername.value.length < 15){
        elMsg.textContent = 'Phải có 15 kí tự trở lên';
    }else {
        elMsg.textContent = '';
    }
}

function checkPw(){
    var elMsg = document.getElementById('kiemtra2');
    var elcheckPw = document.getElementById('password');
    if (elcheckPw.value.length < 5){
        elMsg.textContent = 'Phải có 5 kí tự trở lên';
    }else {
        elMsg.textContent = '';
    }
}

function checkPw2() {
    var elMsg = document.getElementById('kiemtra3');
    var elcheckPw2 = document.getElementById('password2');
    if (elcheckPw2 != checkPw()){
        elMsg.textContent = 'Sai mật khẩu';
    }else {
        elMsg.textContent = '';
    }
}

function checkEmail(){
    var elMsg = document.getElementById('kiemtra4')
    var gmail = document.getElementById('gmail');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!filter.test(gmail.value)) {
        elMsg.textContent = 'Gmail không đúng định dạng'
    }
    else{
        elMsg.textContent = ('Gmail hợp lệ');
    }
}




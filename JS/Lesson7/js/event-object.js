$(function (){
    $('li').on('click', function (e){
        $('li span').remove();
        var date = new Date();
        date.setTime(e.timeStamp);
        $(this).append('<span class="date">' + clicked + ' ' + e.type + '</span>');
    });
});
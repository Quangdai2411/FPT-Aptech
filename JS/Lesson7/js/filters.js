$(function (){
    var $listTems = $('li');

    $listTems.filter('.hot:last').removeClass('hot');
    $('li:not(.hot)').addClass('cool');
    $listTems.has('em').addClass('complete');

    $listTems.each(function (){
        var $this = $(this);
        if ($this.is('.hot')){
            $this.prepend('Priority item :');
        }
    });

    $('li:contains("honey")').append('(local)');
});
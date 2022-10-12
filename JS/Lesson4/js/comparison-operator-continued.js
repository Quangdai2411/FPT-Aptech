var score1 = 90;
var score2 = 95;
var hightscore1 = 75;
var hightscore2 = 95;

var comparison = (score1 + score2) > (hightscore1 + hightscore2);

var el = document.getElementById('answer');
el.textContent = 'New hight score' + comparison;
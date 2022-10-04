var subtotal = (13 + 1) * 5;

var shipping = 0.5 * (13 + 1);

var total = subtotal + shipping;

var elSub = document.getElementById(elementld : subtotal);
elSub.textContent = subtotal;

var elShip = document.getElementById(elementld : shipping);
elShip.textContent = shipping;

var elTotal = document.getElementById(elementld : total);
elTotal.textContent = total;
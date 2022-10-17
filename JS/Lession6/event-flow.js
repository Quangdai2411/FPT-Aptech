function showElements() {
    alert(this.innerHTML);
}

el = document.getElementById('list');
el.addEventListener('click', showElements, false);

el = document.getElementById('item');
el.addEventListener('click', showElements, false);

el = document.getElementById('link');
el.addEventListener('click', showElements, false);

el = document.getElementById('list2');
el.addEventListener('click', showElements, true);

el = document.getElementById('link2');
el.addEventListener('click', showElements, true);

el = document.getElementById('list2');
el.addEventListener('click', showElements, true);


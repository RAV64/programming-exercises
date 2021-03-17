function randomInteger(from, to) {
    return Math.floor(Math.random() * (to - from + 1)) + from
}

function rollTheDice() {
    document.getElementById("dice").innerHTML = randomInteger(1, 6);
}
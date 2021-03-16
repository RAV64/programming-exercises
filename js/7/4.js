function randomInteger(from, to) {
    var randInt = Math.floor(Math.random() * (to - from + 1)) + from;
    return randInt
}

function rollTheDice() {
    var diceValue = randomInteger(1, 6);
    document.getElementById("dice").innerHTML = diceValue;    
}
var minigolf = [23, 19, 37, 20, 21, 30, 26, 24];

function showResults() {
    minigolf.sort();
    document.getElementById("answer").innerHTML = 
    `The smallest result is ${minigolf[0]} (winner).<br>The biggest result is ${minigolf.pop()}.`;
};

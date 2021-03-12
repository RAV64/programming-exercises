function play() {
    bet = document.getElementById("bet").value;
    var pips = Math.round( (Math.random( ) * 5) + 1 );
    if (pips == 1 || pips == 3 || pips == 5) {
        document.getElementById("answer").innerHTML = 
        `Pips was ${pips} - no pay`;
    } else if (pips == 2 || pips == 4) {
        document.getElementById("answer").innerHTML =
        `Pips was ${pips} - Paid back: ${(bet*1.25).toFixed(2)}`;
    } else {
        document.getElementById("answer").innerHTML =
        `Pips was ${pips} - Paid back: ${(bet*1.50).toFixed(2)}`
    }
}
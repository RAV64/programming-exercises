function showComparisonScores() {
    v = Number(document.getElementById("votes").value);
    c = Number(document.getElementById("candidates").value);
    var i;
    fin = ''
    for (i = 0; i < c; i ++) {
        fin += `${i+1}. candidate: ${(v/(i+1)).toFixed(0)}<br>`
    }
    document.getElementById("answer").innerHTML = fin
}
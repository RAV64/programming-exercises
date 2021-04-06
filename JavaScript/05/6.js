function showComparisonScores() {
    let v = Number(document.getElementById("votes").value);
    let c = Number(document.getElementById("candidates").value);
    let i;
    let fin = ''
    for (i = 0; i < c; i ++) {
        fin += `${i+1}. candidate: ${(v/(i+1)).toFixed(0)}<br>`
    }
    document.getElementById("answer").innerHTML = fin
}
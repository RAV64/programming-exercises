function showWeightGoals() {
    var weight = Number(document.getElementById("weight").value);
    week = 0;
    var fin = '';
    while (week != 7){
        week++;
        newWeight = weight-(weight * 0.1 / 7 * week)
        fin += `After ${week}. week ${newWeight.toFixed(1)} kg<br>`
    }
    document.getElementById("answer").innerHTML = fin
}
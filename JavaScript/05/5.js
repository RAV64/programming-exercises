function showWeightGoals() {
    const weight = Number(document.getElementById("weight").value);
    let week = 0;
    let fin = '';
    let newWeight;
    while (week !== 7) {
        week++;
        newWeight = weight - (weight * 0.1 / 7 * week)
        fin += `After ${week}. week ${newWeight.toFixed(1)} kg<br>`
    }
    document.getElementById("answer").innerHTML = fin
}
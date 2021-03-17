function calculateProfit() {
    let rounds = Number(document.getElementById("rounds").value);
    let i;
    let wins = 0;
    let profits = 0;

    for (i = 0; i < rounds; i ++) {
        const pips = Math.round((Math.random() * 5) + 1);

        if (pips === 1 || pips === 3 || pips === 5) {
            wins += 0;
            profits += 1;
        } else if (pips === 2 || pips === 4) {
            wins += 1.25
            profits -= 0.25
        } else if (pips === 6) {
            wins += 1.50
            profits -= 0.50
        }
    }

    let roundsfin = "Total amount of rounds: " + rounds;
    let winsfin = "Player wins were: " + wins;
    let profitsfin = "Casino profits were: " + profits;
    document.getElementById("answer").innerHTML =
    `${roundsfin}<br>${winsfin}<br>${profitsfin}`
}
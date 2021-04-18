function ryhma(ryhma) {
    let count = 0;
    const veriryhmat = ["A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+"];
    for (let veri in veriryhmat) {
        if (veriryhmat[veri] === ryhma) {
            count++
        }
    }
    console.log(`Veriryhmiä ${ryhma} on ${count} kappaletta.`)
}

ryhma("AB+")
function laskeTyoHinta(alkoi, paattyi, tuntihinta) {
    let startHours = Number(alkoi.substr(0, 2))
    let startMins = Number(alkoi.substr(3, 2))
    let endHours = Number(paattyi.substr(0, 2))
    let endMins = Number(paattyi.substr(3, 2))
    let hours = endHours - startHours
    let mins = (endMins - startMins) / 60
    let wage = ((hours + mins) * tuntihinta).toFixed(2)
    console.log("Työn hinta on " + wage)
}

laskeTyoHinta("12:08", "13:55", 48)
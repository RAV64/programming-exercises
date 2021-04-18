function heturesolver(hetu) {
    let final = ""
    if (Number(hetu.charAt(9)) % 2 === 0) {
        final += "Sukupuoli on nainen.\n"
    } else {
        final += "Sukupuoli on mies.\n"
    }
    switch (hetu.charAt(6)) {
        case "+": final += `Syntymäpäivä on ${hetu.substr(0, 2)}.${hetu.substr(2,2)}.${Number(hetu.substr(4,2)) + 1800}.`
            break
        case "-": final += `Syntymäpäivä on ${hetu.substr(0, 2)}.${hetu.substr(2,2)}.${Number(hetu.substr(4,2)) + 1900}.`
            break
        case "A": final += `Syntymäpäivä on ${hetu.substr(0, 2)}.${hetu.substr(2,2)}.${Number(hetu.substr(4,2)) + 2000}.`
            break
    }
    console.log(final)
}

heturesolver("241289-123A")
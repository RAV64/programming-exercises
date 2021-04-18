function laskeVahennys(matkakulut) {
    let fin = matkakulut - 750
    if (fin > 0) {
        console.log("Vähennys on " + fin.toFixed(2))
    } else {
        console.log("Vähennys on 0.00")
    }
}

function laskeVahennysCaller(){
    laskeVahennys(2000)
    laskeVahennys(500)
}

laskeVahennysCaller()
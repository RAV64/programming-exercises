function maxKelaMonney(length){
    if (length<=10){
        return 8.00
    } else if (length<=20){
        return 11.00
    } else if (length<=30){
        return 13.50
    } else if (length<=45){
        return 16.50
    } else {
        return 21.00
    }
}

function calculate() {
    var len = Number(document.getElementById("length").value);
    var kelaCash = maxKelaMonney(len);
    var fee = document.getElementById("doctorsFee").value;
    document.getElementById("answer").innerHTML =
    `Length of visit is ${len} minutes.<br>Kela reimbursement is ${kelaCash.toFixed(2)} euros.`
}
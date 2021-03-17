function maxKelaMonney(length){
    if (length<=10){
        return 8.00;
    } else if (length<=20){
        return 11.00;
    } else if (length<=30){
        return 13.50;
    } else if (length<=45){
        return 16.50;
    } else {
        return 21.00;
    }
}

function customerFee(kelaCash, fee) {
    return (fee - kelaCash + 15.90);
}

function calculate() {
    const len = Number(document.getElementById("length").value);
    const kelaCash = maxKelaMonney(len);
    const fee = Number(document.getElementById("doctorsFee").value);
    const cusFee = customerFee(kelaCash, fee);
    const x1 = "Doctor's Fee is " + fee.toFixed(2) + " euros.<br>";
    const x2 = "Kela reimbursement is " + kelaCash.toFixed(2) + " euroa.<br>";
    const x3 = "Office Fee is 15.90 euros<br>";
    const x4 = "Customer needs to pay " + cusFee.toFixed(2) + " euros.";
    document.getElementById("answer").innerHTML = x1 + x2 + x3 + x4;
}
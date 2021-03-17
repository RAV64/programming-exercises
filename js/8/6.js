function isSunday(dateText) {
    const myDate = new Date();
    const day = Number(dateText.substring(0, 2));
    const month = Number(dateText.substring(3, 5)) - 1;
    const year = Number(dateText.substring(6, 10));
    myDate.setFullYear(year, month, day);
    return myDate.getDay() === 0;
}

function calculate() {

    let price;
    let sun;
    const workTitle = document.getElementById("title").value;
    const date = document.getElementById("date").value;
    const isSun = isSunday(date);
    const startTime = document.getElementById("startTime").value;
    const endTime = document.getElementById("endTime").value;
    const desc = document.getElementById("description").value;

    if (isSun){
        sun = "(sunday)";
        price = 72;
    } else {
        sun = "(work day).";
        price = 48;
    }

    document.getElementById("answer").innerHTML =
    `<p>Date ${date} ${sun}<br>The price of this repair work is  ${price} euros per hour.</p>`
}
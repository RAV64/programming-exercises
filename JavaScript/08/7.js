function isSunday(dateText) {
    const myDate = new Date();
    const day = Number(dateText.substring(0, 2));
    const month = Number(dateText.substring(3, 5)) - 1;
    const year = Number(dateText.substring(6, 10));
    myDate.setFullYear(year, month, day);
    return myDate.getDay() === 0;
}
function allCapsTitleTrimmed(text){
    let x = text.toUpperCase();
    x = x.trim();
    document.getElementById("title").value = x;
}
function length(start, end){
    const startHours = Number(start.substring(0, 2));
    const startMins = Number(start.substring(3, 5));
    const endHours = Number(end.substring(0, 2));
    const endMins = Number(end.substring(3, 5));
    return (((endHours * 60) + endMins) - ((startHours * 60) + startMins));
}

function calculate() {
    let day;
    let price;
    const date = document.getElementById("date").value;
    const isSun = isSunday(date);
    const startTime = document.getElementById("startTime").value;
    const endTime = document.getElementById("endTime").value;
    const len = length(startTime, endTime);
    const desc = document.getElementById("description").value;
    if (isSun){
        price = 72;
        day = "Sundays";
    } else {
        price = 48;
        day = "workdays";
    }
    document.getElementById("answer").innerHTML =
    `Length of the work was ${len} minutes.<br>The hourly price is during the ${day} ${price.toFixed(2)} euros.<br>The price of this repair work is ${(len/60 * price).toFixed(2)} euros.`;
}

function modifyTitle(){
    const workTitle = document.getElementById("title").value;
    allCapsTitleTrimmed(workTitle);
}
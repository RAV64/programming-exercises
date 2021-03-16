function isSunday(dateText) {
    var myDate = new Date();
    var day = Number(dateText.substring(0,2));
    var month = Number(dateText.substring(3,5))-1;
    var year = Number(dateText.substring(6,10));
    myDate.setFullYear(year, month, day);
    if(myDate.getDay() == 0) {
        return true;
    } else {
        return false;
    }
}
function allCapsTitleTrimmed(text){
    x = text.toUpperCase();
    x = x.trim();
    document.getElementById("title").value = x;
}
function length(start, end){
    var startHours = Number(start.substring(0,2));
    var startMins = Number(start.substring(3,5));
    var endHours = Number(end.substring(0,2));
    var endMins = Number(end.substring(3,5));
    return (((endHours * 60) + endMins) - ((startHours * 60) + startMins));
}

function calculate() {
    var date = document.getElementById("date").value;
    var isSun = isSunday(date);
    var startTime = document.getElementById("startTime").value;
    var endTime = document.getElementById("endTime").value;
    var len = length(startTime, endTime);
    var desc = document.getElementById("description").value;
    if (isSun){
        var price = 72;
        var day = "Sundays";
    } else {
        var price = 48;
        var day = "workdays";
    }
    document.getElementById("answer").innerHTML =
    `Length of the work was ${len} minutes.<br>The hourly price is during the ${day} ${price.toFixed(2)} euros.<br>The price of this repair work is ${(len/60 * price).toFixed(2)} euros.`;
}

function modifyTitle(){
    var workTitle = document.getElementById("title").value;
    allCapsTitleTrimmed(workTitle);
}
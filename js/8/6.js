function isSunday(dateText) {

	var myDate = new Date();
	var day = Number(dateText.substring(0,2));
    var month = Number(dateText.substring(3,5))-1;
    var year = Number(dateText.substring(6,10));
    myDate.setFullYear(year, month, day);

    if(myDate.getDay() == 0) {
        return true
    } else {
        return false
    }
}

function calculate() {

    var workTitle = document.getElementById("title").value;
    var date = document.getElementById("date").value;
    var isSun = isSunday(date);
    var startTime = document.getElementById("startTime").value;
    var endTime = document.getElementById("endTime").value;
    var desc = document.getElementById("description").value;

    if (isSun){
        var sun = "(sunday)"
        var price = 72
    } else {
        var sun = "(work day)."
        var price = 48
    }

    document.getElementById("answer").innerHTML =
    `<p>Date ${date} ${sun}<br>The price of this repair work is  ${price} euros per hour.</p>`
}
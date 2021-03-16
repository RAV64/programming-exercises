function tellAge() {
    var yob = Number(document.getElementById("yearOfBirth").value);
    var year = new Date().getFullYear();
    if (yob > year){
        document.getElementById("answer").innerHTML =
        "You can't use this program from future.";
    } else {
        document.getElementById("answer").innerHTML = 
        `You are now ${year - yob} years old.<br> (Current year is ${year}.)`;
    }
}
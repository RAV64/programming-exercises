function tellInfractionFine(){
    ds = Number(document.getElementById("drivingSpeed").value);
    sl = Number(document.getElementById("speedLimit").value);
    if (ds <= sl) {
        document.getElementById("answer").innerHTML =
        "No speeding, no fine.";
    } else if ((sl >= 10 && 60 >= sl) && ((ds - sl) <= 15)) {
        document.getElementById("answer").innerHTML =
        "Infraction fine is 85 euros.";
    } else if ((sl >= 10 && 60 >= sl) && ((ds - sl) > 15) && ((ds - sl) <= 20)) {
        document.getElementById("answer").innerHTML =
        "Infraction fine is 115 euros.";
    } else if ((sl >= 70 && 120 >= sl) && ((ds - sl) <= 15)) {
        document.getElementById("answer").innerHTML =
        "Infraction fine is 70 euros.";
    } else if ((sl >= 70 && 120 >= sl) && ((ds - sl) > 15) && ((ds - sl) <= 20)) {
        document.getElementById("answer").innerHTML =
        "Infraction fine is 100 euros.";
    } else {
        document.getElementById("answer").innerHTML =
        "Income-based unit fine.";
    }
}
function tellAge() {
    const yob = Number(document.getElementById("yearOfBirth").value);
    const year = new Date().getFullYear();
    if (yob > year){
        document.getElementById("answer").innerHTML =
        "You can't use this program from future.";
    } else {
        document.getElementById("answer").innerHTML = 
        `You are now ${year - yob} years old.<br> (Current year is ${year}.)`;
    }
}
function calculateSalary(hours, hourlySalary) {
    return hours * hourlySalary
}

function showGrossSalary() {
    var hours = document.getElementById("hours").value;
    var euros = document.getElementById("hourlySalary").value;
    var grossSalary = calculateSalary(hours, euros);
    document.getElementById("answer").innerHTML = 
    `Gross salary is ${grossSalary.toFixed(2)} euros.`
}

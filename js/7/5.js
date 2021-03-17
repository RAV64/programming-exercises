function calculateSalary(hours, hourlySalary) {
    return hours * hourlySalary
}

function showGrossSalary() {
    const hours = document.getElementById("hours").value;
    const euros = document.getElementById("hourlySalary").value;
    const grossSalary = calculateSalary(hours, euros);
    document.getElementById("answer").innerHTML = 
    `Gross salary is ${grossSalary.toFixed(2)} euros.`
}

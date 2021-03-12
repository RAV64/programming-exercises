function calculateRent() {
	rent = Number(document.getElementById("rent").value)
	x = Number(document.getElementById("participants").value)
    document.getElementById("answerDiv").innerHTML = 
	"Rent per participants is " + (rent/x).toFixed(2) + " euros."
}
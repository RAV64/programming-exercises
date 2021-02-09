function calculateCosts() {
	kilometers = Number(document.getElementById("kilometers").value)
	consumption = Number(document.getElementById("consumption").value)
	price = Number(document.getElementById("price").value)
	participants = Number(document.getElementById("participants").value)
	final = (consumption/100.0*price*kilometers/participants).toFixed(2)
    document.getElementById("answerID").innerHTML =
	"Fuel costs per participant is "+final+" euros."
}
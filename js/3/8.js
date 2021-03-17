function calculateCosts() {
	let kilometers = Number(document.getElementById("kilometers").value)
	let consumption = Number(document.getElementById("consumption").value)
	let price = Number(document.getElementById("price").value)
	let participants = Number(document.getElementById("participants").value)
	let final = (consumption / 100.0 * price * kilometers / participants).toFixed(2)
    document.getElementById("answerID").innerHTML =
	"Fuel costs per participant is "+final+" euros."
}
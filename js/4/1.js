function calculateFee() {
	const price = document.getElementById("price").value;
	let fee = (price * 0.0344).toFixed(2);
	if (fee <= 2400) {
	fee = (2400).toFixed(2);
    }
    document.getElementById("fee").innerHTML =
	`Real state agent's fee is ${fee} euros`
}
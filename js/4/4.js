function calculateBMI() {
	let weight = document.getElementById("weight").value;
	let height = document.getElementById("height").value;
	let BMI = (weight / (height / 100.0 * height / 100.0)).toFixed(2);
	let state;
	if (BMI <= 18.4) {
		state = "Weight less than normal weight";
	} else if (BMI >= 18.5 && BMI <= 24.9) {
		state = "Normal weight";
	} else {
		state = "Overweight";
	}
	document.getElementById("answer").innerHTML =
		`Body Mass Index (BMI) is ${BMI} (${state})`
}
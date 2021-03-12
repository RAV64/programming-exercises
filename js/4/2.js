function checkAge() {
	age = document.getElementById("age").value;
	if (age < 18) {
		console.log("Adolescents are not allowed to play.")
	} else {
		console.log("Old enough to play.");
    } 
} 
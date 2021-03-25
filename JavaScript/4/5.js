function showStudyGrant(){
	let age = document.getElementById("age").value;
	let wp = document.getElementById("withParents").value;
	
	if (age >= 20 && wp === "n") {
		document.getElementById("answer").innerHTML =
			"The study grant is 335.20 euros.";
	} else if (age >= 20 && wp === "y") {
		document.getElementById("answer").innerHTML =
			"The study grant is 136.70 euros.";
	} else {
		document.getElementById("answer").innerHTML =
		"Ask Kela."
	}
}
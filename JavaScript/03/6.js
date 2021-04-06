function calculateUnitFine(){
	const x = Number(document.getElementById("txtNetIncome").value);
	document.getElementById("answerDiv").innerHTML = 'Unit fine is ' + ((x - 255) / 60).toFixed(2) + ' euros.'
}
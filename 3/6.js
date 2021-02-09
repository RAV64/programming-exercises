function calculateUnitFine(){
	var x = Number(document.getElementById("txtNetIncome").value);
	var y = 'Unit fine is '+((x - 255)/60).toFixed(2)+' euros.'
	document.getElementById("answerDiv").innerHTML = y
}
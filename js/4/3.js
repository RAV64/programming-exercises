function comparePackages() {
	tm = document.getElementById("textMessages").value
	ct = document.getElementById("callTime").value
	sp = (19.90 + ct * 0.069 + tm * 0.069).toFixed(2)
	ap = (29.90).toFixed(2)
	if (sp > ap) {
        document.getElementById("answer").innerHTML =
		`The All-inclusive package (${ap}) is cheaper than the Special package (${sp})`
	} else {
        document.getElementById("answer").innerHTML =
		`The Special package (${sp}) is cheaper than the All-inclusive package (${ap})`
	}
} 
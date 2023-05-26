function calculate(value) {
	var result = document.getElementById('result');
	if (value == '=') {
		result.value = eval(result.value);
	} else {
		result.value += value;
	}
}

function clearDisplay() {
	document.getElementById('result').value = '';
}

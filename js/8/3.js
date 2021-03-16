function processName() {
    var name = document.getElementById("name").value;
    var capName = name.toUpperCase();
    var lowName = name.toLowerCase();
    var lenName = name.length;
    document.getElementById("upperCase").innerHTML =
    `With upper case letters: ${capName}`
    document.getElementById("lowerCase").innerHTML =
    `With lower case letters: ${lowName}`
    document.getElementById("length").innerHTML =
    `Character count: ${lenName}`
}
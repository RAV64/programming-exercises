function processName() {
    const name = document.getElementById("name").value;
    const capName = name.toUpperCase();
    const lowName = name.toLowerCase();
    const lenName = name.length;
    document.getElementById("upperCase").innerHTML =
    `With upper case letters: ${capName}`
    document.getElementById("lowerCase").innerHTML =
    `With lower case letters: ${lowName}`
    document.getElementById("length").innerHTML =
    `Character count: ${lenName}`
}
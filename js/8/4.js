function getName(){
    return document.getElementById("name").value;
}
function upper(name){
    return `With upper case letters: ${name.toUpperCase()}`;
}

function lower(name){
    return `With lower case letters: ${name.toLowerCase()}`;
}

function len(name){
    return `Character count: ${name.length}`;
}

function containsMuumi(name){
    if (name.search("muumi")>= 0){
        return "Contains the text muumi.";
    } else {
        return "Doesn't contain the text muumi.";
    }
}

function firstLetter(name){
    return `First character: ${name.charAt(0)}`;
}

function firstThreeLetters(name){
    return `First three characters: ${name.substring(0,3)}`;
}

function processName() {

    const name = getName();
    const capName = upper(name);
    const lowName = lower(name);
    const lenName = len(name);
    const muumi = containsMuumi(name);
    const firstL = firstLetter(name);
    const first3L = firstThreeLetters(name);

    document.getElementById("upperCase").innerHTML = capName;
    document.getElementById("lowerCase").innerHTML = lowName;
    document.getElementById("length").innerHTML = lenName;
    document.getElementById("contains").innerHTML = muumi;
    document.getElementById("firstCharacter").innerHTML = firstL;
    document.getElementById("manyCharacters").innerHTML = first3L;
}
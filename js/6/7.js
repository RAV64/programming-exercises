var names = [];
var nameList = "";

function addName() {
    names.push(document.getElementById("name").value);
    document.getElementById("name").value = "";
    for (var i = 0; i < names.length; i++) {
            nameList += " " + names[i];
    };
    document.getElementById("nameList").innerHTML = `Inserted names:${nameList}`;
    nameList = "";
};

function makeDraw() {
    var winningIndex = Math.floor(Math.random() * names.length);
    document.getElementById("answer").innerHTML = 
    `<br>Winner is ${names[winningIndex]}`;
};

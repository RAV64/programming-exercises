function req() {
    fetch("http://gis.vantaa.fi/rest/tyopaikat/v1/Harjoittelu%20ja%20kes%C3%A4ty%C3%B6")
        .then(
            function (response) {
                if (response.status !== 200) {
                    console.log('Error: ' + response.status);
                    return;
                }
                response.json().then(function (data) {
                    let print = ''
                    for (let i = 0; i < data.length; i++) {
                        print += "<br><b>" + data[i].tyotehtava + "</b><br>"
                        print += "Osoite: " + data[i].osoite + "<br>"
                        print += "Haku päättyy: " + data[i].haku_paattyy_pvm + "<br>"
                    }
                    document.getElementById("answer").innerHTML = print
                });
            }
        )
        .catch(function (err) {
            console.log('Error: ', err);
        });
}

req();
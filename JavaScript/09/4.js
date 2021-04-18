function kuvat() {
    const kuvat = [
        "https://myy.haaga-helia.fi/~swd1ta001/kuvatJS/assi.jpg",
        "https://myy.haaga-helia.fi/~swd1ta001/kuvatJS/myynti.jpg",
        "https://myy.haaga-helia.fi/~swd1ta001/kuvatJS/tiko.jpg",
        "https://myy.haaga-helia.fi/~swd1ta001/kuvatJS/yleinen1.jpg",
        "https://myy.haaga-helia.fi/~swd1ta001/kuvatJS/yleinen2.jpg"
    ];

    let teksti = ""
    for (let kuva in kuvat) {
        teksti += "<img src=" + kuvat[kuva] + " alt=kuva>\n"
    }

    console.log(teksti)
}

kuvat()
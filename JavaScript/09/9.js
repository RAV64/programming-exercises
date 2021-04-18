let info = {
    "coord": {"lon": 24.94, "lat": 60.17},
    "weather": [{"id": 801, "main": "Clouds", "description": "pilvinen", "icon": "08n"}],
    "base": "stations",
    "main": {"temp": 19, "pressure": 1045, "humidity": 64, "temp_min": 9, "temp_max": 27},
    "visibility": 10000,
    "wind": {"speed": 3.2, "deg": 30},
    "clouds": {"all": 20},
    "dt": 1519730400,
    "sys": {
        "type": 1, "id": 5019, "message": 0.0043, "country": "FI", "sunrise": 1575529418,
        "sunset": 1575551884
    }, "id": 658225,
    "name": "Helsinki",
    "cod": 200
}


console.log(info.weather[0].description)
console.log("Lämpötila: " + info.main.temp + "°")
console.log("Tuuli: " + info.wind.speed.toFixed(0) + " m/s")
console.log("Pilvisyys: " + (100 - (Number(info.clouds.all)) / 10).toFixed(0) + "%")
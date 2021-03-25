var earth;

function initialize() {
    var options = {
        atmosphere: true,
        center: [0, 0],
        zoom: 0
    };
    earth = new WE.map('earth_div', options);
  
    WE.tileLayer('http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: 'Â© OpenStreetMap contributors'
    }).addTo(earth);

}

function goHome() {
    earth.setView([x,y]);
	earth.setZoom(13);
}
function setHome() {
    x = earth.getCenter()[0];
    y = earth.getCenter()[1];
}
function showCoords() {
    alert(earth.getCenter());
}
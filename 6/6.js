var images = ["face.png", "heart.png", "sun.png", "moon.png", "cloud.png"];

function addImages() {
    for (var i = 0; i < images.length; i++) {
        document.write(`<img src='${images[i]}' alt='Funny shape'>`);
    };
};
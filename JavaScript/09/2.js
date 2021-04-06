let json = '[{"number": 1, "name": "Samsung Smart LED-TV", "price": 449.00, "description": "HD-digi ready"},' + '{"number": 2, "name": "Samsung 2.1 SoundBar Home Theater", "price": 198.00, "description": "Connect to TV and stream music wireless"},' + '{"number": 3, "name": "Dilog CI+/CA module for pay-tv-cards", "price": 63.90, "description": "CI+ module for the table televisions"}]';

let products = JSON.parse(json);


function listProducts() {
    let print = '';
    for (let i = 0; i < products.length; i++) {
        print += "<br><br>Number: "
        print += products[i].number;
        print += "<br>Name: "
        print += products[i].name;
        print += "<br>Price: "
        print += products[i].price.toFixed(2);
        print += "<br>Description: "
        print += products[i].description;
    }
    document.getElementById("productList").innerHTML = print
}

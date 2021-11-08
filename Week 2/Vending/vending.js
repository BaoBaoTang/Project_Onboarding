const coins = [500, 200, 100, 50, 20, 10];

// productNumber is 1-indexed
function vendingMachine(products, money, productNumber) {
    if (productNumber == 0 || productNumber > products.length) 
        return "Enter a valid product number";
    if (money < products[productNumber-1].money)
        return "Not enough money for this product";
    money -= products[productNumber-1].money;
    let change = [];
    for (const coin of coins) {
        while (money >= coin) {
            money -= coin;
            change.push(coin);
        }
    }
    return {product: products[productNumber-1].name, change: change};
}

const snacks = [
    {name: "Espresso", money: 100},
    {name: "Cappuccino", money: 250},
    {name: "Chocolate bar", money: 200},
    {name: "Potato Chips", money: 350}
];

console.log(vendingMachine(snacks, 400, 1));
console.log(vendingMachine(snacks, 200, 2));
console.log(vendingMachine(snacks, 1000, 4));
console.log(vendingMachine(snacks, 400, 5));
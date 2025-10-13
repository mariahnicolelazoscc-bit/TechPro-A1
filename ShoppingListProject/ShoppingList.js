const prompt = require("prompt-sync")({ sigint: true });

let shoppingList = [];

console.log("Enter up to 5 items to buy:");
for (let i = 0; i < 5; i++) {
    let item = prompt("> ");
    if (item.trim() === "") break;
    shoppingList.push(item);
}

console.log("\nYour shopping list:");
console.log(shoppingList.join(", "));

console.log(\nYou entered ${shoppingList.length} item(s).);

let searchItem = prompt("\nSearch for an item: ");
if (shoppingList.includes(searchItem)) {
    console.log(${searchItem} is in your shopping list!);
} else {
    console.log(${searchItem} is NOT in your shopping list.);
}
// 1. Create a Character Object
let character = {
    name: "Hero",
    health: 100,

    // 2. Add a Random Class
    class : ["Warrior", "Mage", "Archer", "Healer", "Assassin"],
    
    // 3. Add Randomized Health
    randomizeHealth(){
        return Math.floor(Math.random() * 100) + 50;
    },

    // 4. Assign a Special Ability
    specialAbility : ["Fireball", "Healing Touch", "Stealth", "Lightning Strike", "Power Slash"],
}

// 5. Create a generateCharacter() Function
function generateCharacter(otherCharacter){
    let names = ["Thorin", "Elara", "Zane", "Ivy", "Dante"];
    return newCharacter = {
        randomName:  otherCharacter!=null? otherCharacter : names[Math.floor(Math.random() * names.length)],
        randomClass: character.class[Math.floor(Math.random() * character.class.length)],
        randomHealth: character.randomizeHealth(),
        randomSpecialAbility: character.specialAbility[Math.floor(Math.random() * character.specialAbility.length)],
        battle(enemy){
            let fullHP = enemy.randomHealth;
            let subtractedHP = enemy.randomHealth - Math.floor(Math.random() * 100) + 20 >0?enemy.randomHealth - Math.floor(Math.random() * 100) + 20:0;
            console.log(`Character ${this.randomName} attacked Character ${enemy.randomName} with ${this.randomSpecialAbility}. ${enemy.randomName}'s health dropped from ${fullHP} to ${subtractedHP}`)
        }
    }
}


// 6. Battle Simulation
const character1 = generateCharacter("Sakamote");
const character2 = generateCharacter("Elara");

console.dir(character1);
console.dir(character2);

character1.battle(character2);


// 7. Generate Multiple Characters
function generateMultipleCharacters(count){
    let party = [];
    for(let i = 0; i < count; i++){
        party.push(generateCharacter());
    }
    return party;
}

const party = generateMultipleCharacters(5);
console.dir(party); 
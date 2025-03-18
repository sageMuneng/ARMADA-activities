let warrior1 = {
    name: "Superman",
    hp: 100,
    strength: 10,
    attack() {
        let attack_strngth = Math.floor(Math.random() * this.strength);
        return attack_strngth;
    }
}

let warrior2 = {
    name: "Batman",
    hp: 100,
    strength: 10,
    attack() {
        let attack_strngth = Math.floor(Math.random() * this.strength);
        return attack_strngth;
    }
}

for (let round = 1; round <= 10; round++) {
    if (warrior1.hp == 0) {
        break;
    }
    let attack1 = warrior1.attack();
    if (warrior2.hp - attack1 > 0) {
        warrior2.hp -= attack1;
    } else {
        warrior2.hp = 0;
    }

    console.log(`
        === Round ${round} ===
        ${warrior1.name} attacks ${warrior2.name} and does ${attack1} damage!
        ${warrior1.name} HP: ${warrior1.hp} | ${warrior2.name} HP: ${warrior2.hp}
    `);

    if (warrior2.hp == 0) {
        break;
    }

    let attack2 = warrior2.attack();
    if (warrior1.hp - attack2 > 0) {
        warrior1.hp -= attack2;
    } else {
        warrior1.hp = 0;
    }
    console.log(`
        ${warrior2.name} attacks ${warrior1.name} and does ${attack2} damage!
        ${warrior1.name} HP: ${warrior1.hp} | ${warrior2.name} HP: ${warrior2.hp}
    `);
}

if (warrior1.hp > warrior2.hp) {
    console.log(`🏆 ${warrior1.name} WINS the battle! 🏆`);
} else if (warrior1.hp == warrior2.hp) {
    console.log(`The battle is draw`);
} else {
    console.log(`🏆 ${warrior2.name} WINS the battle! 🏆`);
}
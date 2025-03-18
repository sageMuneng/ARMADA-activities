let agent1 = {
    agentID: 'a1',
    profile: 'assets/agent1/agent1_card.avif',
    name: "Brimstone",
    role: "Controller",
    specialAbilities: [
        {
            icon: 'assets/agent1/SA1.avif',
            title: 'INCENDIARY',
            description: 'EQUIP an incendiary grenade launcher. FIRE to launch a grenade that detonates as it comes to a rest on the floor, creating a lingering fire zone that damages players within the zone.'
        },
        {
            icon: 'assets/agent1/SA2.avif',
            title: 'SKY SMOKE',
            description: "EQUIP a tactical map. FIRE to set locations where Brimstone's smoke clouds will land. ALT FIRE to confirm, launching long-lasting smoke clouds that block vision in the selected area."
        },
        {
            icon: 'assets/agent1/SA3.avif',
            title: 'STIM BEACON',
            description: "EQUIP a stim beacon. FIRE to toss the stim beacon in front of Brimstone. Upon landing, the stim beacon will create a field that grants players RapidFire."
        },
        {
            icon: 'assets/agent1/SA4.avif',
            title: 'ORBITAL STRIKE',
            description: 'EQUIP a tactical map. FIRE to launch a lingering orbital strike laser at the selected location, dealing high damage-over-time to players caught in the selected area.'
        },
    ]
}
let agent2 = {
    agentID: 'a2',
    profile: 'assets/agent2/agent2_card.avif',
    name: "Pheonix",
    role: "Duelist",
    specialAbilities: [
        {
            icon: 'assets/agent2/SA1.avif',
            title: 'CURVEBALL',
            description: 'EQUIP a flare orb that takes a curving path and detonates shortly after throwing. FIRE to curve the flare orb to the left, detonating and blinding any player who sees the orb. ALTERNATE FIRE to curve the flare orb to the right.'
        },
        {
            icon: 'assets/agent2/SA2.avif',
            title: 'HOT HANDS',
            description: 'EQUIP a fireball. FIRE to throw a fireball that explodes after a set amount of time or upon hitting the ground, creating a lingering fire zone that damages enemies.'
        },
        {
            icon: 'assets/agent2/SA3.avif',
            title: 'BLAZE',
            description: 'EQUIP a flame wall. FIRE to create a line of flame that moves forward, creating a wall of fire that blocks vision and damages players passing through it. HOLD FIRE to bend the wall in the direction of your crosshair.'
        },
        {
            icon: 'assets/agent2/SA4.avif',
            title: 'RUN IT BACK',
            description: 'INSTANTLY place a marker at Phoenix’s location. While this ability is active, dying or allowing the timer to expire will end this ability and bring Phoenix back to this location with full health.'
        },
    ]
}
let agent3 = {
    agentID: 'a3',
    profile: 'assets/agent3/agent3_card.avif',
    name: "Sage",
    role: "Sentinel",
    specialAbilities: [
        {
            icon: 'assets/agent3/SA1.avif',
            title: 'SLOW ORB',
            description: 'EQUIP a slowing orb. FIRE to throw a slowing orb forward that detonates upon landing, creating a lingering field that slows players caught inside of it.'
        },
        {
            icon: 'assets/agent3/SA2.avif',
            title: 'HEALING ORB',
            description: 'EQUIP a healing orb. FIRE with your crosshairs over a damaged ally to activate a heal-over-time on them. ALT FIRE while Sage is damaged to activate a self heal-over-time.'
        },
        {
            icon: 'assets/agent3/SA3.avif',
            title: 'BARRIER ORB',
            description: 'EQUIP a barrier orb. FIRE places a solid wall. ALT FIRE rotates the targeter.'
        },
        {
            icon: 'assets/agent3/SA4.avif',
            title: 'RESURRECTION',
            description: 'EQUIP a resurrection ability. FIRE with your crosshairs placed over a dead ally to begin resurrecting them. After a brief channel, the ally will be brought back to life with full health.'
        },
    ]
}
let agent4 = {
    agentID: 'a4',
    profile: 'assets/agent4/agent4_card.avif',
    name: "Sova",
    role: "Initiator",
    specialAbilities: [
        {
            icon: 'assets/agent4/SA1.avif',
            title: 'SHOCK BOLT',
            description: 'EQUIP a bow with a shock bolt. FIRE to send the explosive bolt forward, detonating upon collision and damaging players nearby. HOLD FIRE to extend the range of the projectile. ALT FIRE to add up to two bounces to this arrow.'
        },
        {
            icon: 'assets/agent4/SA2.avif',
            title: 'RECON BOLT',
            description: 'EQUIP a bow with recon bolt. FIRE to send the recon bolt forward, activating upon collision and Revealing the location of nearby enemies caught in the line of sight of the bolt. Enemies can destroy this bolt. HOLD FIRE to extend the range of the projectile. ALT FIRE to add up to two bounces to this arrow.'
        },
        {
            icon: 'assets/agent4/SA3.avif',
            title: 'OWL DRONE',
            description: 'EQUIP an owl drone. FIRE to deploy and take control of movement of the drone. While in control of the drone, FIRE to shoot a marking dart. This dart will Reveal the location of any player struck by the dart. Enemies can destroy the Owl Drone.'
        },
        {
            icon: 'assets/agent4/SA4.avif',
            title: "HUNTER'S FURY",
            description: 'EQUIP a bow with three long-range wall-piercing energy blasts. FIRE to release an energy blast in a line in front of Sova, dealing damage and revealing the location of enemies caught in the line. This ability can be RE-USED up to two more times while the ability timer is active.'
        },
    ]
}
let agent5 = {
    agentID: 'a5',
    profile: 'assets/agent5/agent5_card.avif',
    name: "Jett",
    role: "Duelist",
    specialAbilities: [
        {
            icon: 'assets/agent4/SA1.avif',
            title: 'UPDRAFT',
            description: 'INSTANTLY propel Jett high into the air.'
        },
        {
            icon: 'assets/agent4/SA2.avif',
            title: 'TAILWIND',
            description: 'ACTIVATE to prepare a gust of wind for a limited time. RE-USE the wind to propel Jett in the direction she is moving. If Jett is standing still, she propels forward. Tailwind charge resets every two kills.'
        },
        {
            icon: 'assets/agent4/SA3.avif',
            title: 'CLOUDBURST',
            description: 'INSTANTLY throw a projectile that expands into a brief vision-blocking cloud on impact with a surface. HOLD the ability key to curve the smoke in the direction of your crosshair.'
        },
        {
            icon: 'assets/agent4/SA4.avif',
            title: 'BLADE STORM',
            description: 'EQUIP a set of highly accurate throwing knives. FIRE to throw a single knife and recharge knives on a kill. ALT FIRE to throw all remaining daggers but does not recharge on a kill. "And can revive other agents"'
        },
    ]
}



let agents_array = [agent1, agent2, agent3, agent4, agent5];

document.getElementById('agent_card1').addEventListener('click', function () {
    setPreview(this.src, this.getAttribute('agent-id'));
});
document.getElementById('agent_card2').addEventListener('click', function () {
    setPreview(this.src, this.getAttribute('agent-id'));
});
document.getElementById('agent_card3').addEventListener('click', function () {
    setPreview(this.src, this.getAttribute('agent-id'));
});
document.getElementById('agent_card4').addEventListener('click', function () {
    setPreview(this.src, this.getAttribute('agent-id'));
});
document.getElementById('agent_card5').addEventListener('click', function () {
    setPreview(this.src, this.getAttribute('agent-id'));
});

function setPreview(src, agent_id) {
    document.getElementById('agent_profile').src = src;
    for (let i in agents_array) {
        if (agents_array[i].agentID == agent_id) {
            document.getElementById('agent_name').innerText = agents_array[i].name;

            let agent_abilities_container = document.getElementById('agent_abilities');
            agent_abilities_container.innerHTML = ''; // Clear previous abilities

            for (let ability of agents_array[i].specialAbilities) {
                let agentAbility = document.createElement('li');

                let agentAbilityIcon = document.createElement('img');
                agentAbilityIcon.src = ability.icon;

                let agentAbilityTitle = document.createElement('h4');
                agentAbilityTitle.innerText = ability.title;

                let agentAbilityDescription = document.createElement('p');
                agentAbilityDescription.innerText = ability.description;

                agentAbility.appendChild(agentAbilityIcon);
                agentAbility.appendChild(agentAbilityTitle);
                agentAbility.appendChild(agentAbilityDescription);

                agent_abilities_container.appendChild(agentAbility);
            }


        }
    }
}

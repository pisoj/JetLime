package com.pushpal.jetlime.ui.data

data class Item(
  val id: Int = 0,
  var name: String,
  var date: String = "",
  val description: String? = null,
)

fun getCharacters(): MutableList<Item> {
  return mutableListOf(
    Item(id = 0, name = "Spider-Man", description = "The web-slinging hero of New York"),
    Item(id = 1, name = "Iron Man", description = "Genius inventor in a high-tech suit"),
    Item(id = 2, name = "Thor", description = "Thor, the mighty Asgardian god of thunder, known for his heroic deeds and wielding the powerful hammer Mjolnir."),
    Item(id = 3, name = "Hulk", description = "Green-skinned, incredibly strong hero"),
    Item(id = 4, name = "Black Widow", description = "Expert spy and combatant"),
    Item(id = 5, name = "Captain America", description = "Super soldier with a shield"),
    Item(id = 6, name = "Hawkeye", description = "Master archer and sharpshooter"),
    Item(id = 7, name = "Doctor Strange", description = "Sorcerer Supreme of Mystic Arts"),
    Item(id = 8, name = "Black Panther", description = "King of Wakanda, skilled fighter"),
    Item(id = 9, name = "Captain Marvel", description = "One of the most powerful heroes"),
    Item(id = 10, name = "Ant-Man", description = "Hero with size-shifting abilities"),
    Item(id = 11, name = "Wasp", description = "Flying hero with shrinking power"),
    Item(id = 12, name = "Scarlet Witch", description = "Wields chaos magic"),
    Item(id = 13, name = "Vision", description = "Android with an Infinity Stone"),
    Item(id = 14, name = "Falcon", description = "Aviator with mechanical wings"),
    Item(id = 15, name = "Winter Soldier", description = "Enhanced soldier with a metal arm"),
    Item(id = 16, name = "War Machine", description = "Pilot in an armored combat suit"),
    Item(id = 17, name = "Star-Lord", description = "Leader of the Guardians"),
    Item(id = 18, name = "Groot", description = "Tree-like being, says 'I am Groot'"),
    Item(id = 19, name = "Rocket Raccoon", description = "Genetically altered raccoon"),
    Item(id = 20, name = "Gamora", description = "Deadliest woman in the galaxy"),
    Item(id = 21, name = "Drax", description = "Warrior seeking vengeance"),
    Item(id = 22, name = "Mantis", description = "Empath with antennae"),
    Item(id = 23, name = "Nebula", description = "Cybernetically enhanced warrior"),
    Item(id = 24, name = "Loki", description = "The mischievous Asgardian god"),
    Item(id = 25, name = "Thanos", description = "Titan obsessed with balance"),
    Item(id = 26, name = "Daredevil", description = "Blind hero with heightened senses"),
    Item(id = 27, name = "Jessica Jones", description = "Private investigator with super strength"),
    Item(id = 28, name = "Luke Cage", description = "Hero with unbreakable skin"),
    Item(id = 29, name = "Iron Fist", description = "Martial artist with a mystical force")
  )
}

fun getPlanets(): MutableList<Item> {
  return mutableListOf(
    Item(id = 0, name = "Earth", description = "Home to the Avengers"),
    Item(id = 1, name = "Asgard", description = "Realm of the Norse gods"),
    Item(id = 2, name = "Xandar", description = "Headquarters of the Nova Corps"),
    Item(id = 3, name = "Sakaar", description = "Planet of gladiators and Hulk's arena"),
    Item(id = 4, name = "Titan", description = "Birthplace of Thanos"),
    Item(id = 5, name = "Knowhere", description = "Mining colony in a Celestial's head"),
    Item(id = 6, name = "Ego", description = "Living planet and Celestial being"),
    Item(id = 7, name = "Vormir", description = "Location of the Soul Stone"),
    Item(id = 8, name = "Contraxia", description = "Pleasure planet with icy conditions"),
    Item(id = 9, name = "Zen-Whoberi", description = "Gamora's homeworld"),
    Item(id = 10, name = "Hala", description = "Capital of the Kree Empire"),
    Item(id = 11, name = "Spartax", description = "Planet ruled by Star-Lord's father"),
    Item(id = 12, name = "Maveth", description = "Barren and remote planet"),
    Item(id = 13, name = "Olympia", description = "Home of the Eternals"),
    Item(id = 14, name = "Nidavellir", description = "Dwarven realm, creators of Mjolnir")
  )
}
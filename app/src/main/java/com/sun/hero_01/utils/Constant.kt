package com.sun.hero_01.utils

object Constant {
    const val BASE_URL = "https://ddragon.leagueoflegends.com/cdn"
    const val BASE_LANGUAGE = "data/en_US"
    const val BASE_VERSION = "11.9.1"
    const val PATH_CHAMPION_DETAIL = "champion"
    const val PATH_IMAGE_SKILL = "img/spell"
    const val PATH_IMAGE_PASSIVE = "img/passive"
    const val PATH_IMAGE_SKIN = "img/champion/splash"
    const val PATH_IMAGE_CHAMPION = "img/champion"
    const val PATH_LIST_CHAMPION = "champion.json"
}

object HeroClass {
    const val ASSASSIN = "Assassin"
    const val FIGHTER = "Fighter"
    const val MAGE = "Mage"
    const val TANK = "Tank"
    const val SUPPORT = "Support"
    const val MARKSMAN = "Marksman"
}

object HeroSpellSymbol {
    const val PASSIVE = "P"
    val SKILL = mutableListOf("Q", "W", "E", "R")
}

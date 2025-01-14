package com.sun.hero_01.utils

enum class HeroDifficulty(val diff: IntRange, val nameDiff: String) {
    EASY(1..4, "Easy"),
    AVERAGE(5..6, "Average"),
    HARD(7..8, "Hard"),
    SEVERE(9..10, "Severe")
}

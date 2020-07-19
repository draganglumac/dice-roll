package uk.co.gluedit.diceroll

class Dice(private val sides: Int = 6) {

    fun roll() = (1..sides).random()
}
package src.main

import java.util.*

class Hand(temp_melds : Vector<Meld>, temp_full_hand : MutableList<Tile>){
    var melds = temp_melds
    var full_hand = temp_full_hand
    var points = 0

    // private function
    private fun eastMeld() : Meld{
        var numOfCard = 0
        for (meld in melds) {
            if (meld.card == Tile.EAST) {
                when (meld.type){
                    "Gang" -> return Meld(Tile.EAST, "Gang")
                    "Peng" -> return Meld(Tile.EAST, "Peng")
                    "Pair" -> return Meld(Tile.EAST, "Pair")
                    else -> numOfCard++
                }
            }
        }
        when (numOfCard) {
            4 -> throw FalseHandException()
            3 -> return Meld(Tile.EAST, "Peng", false)
            2 -> return Meld(Tile.EAST, "Pair", false)
            1 -> return Meld(Tile.EAST, "Card")
        }
        return Meld(Tile.INVALID, "Card")
    }

    fun bigFourWinds() : Boolean{
        return true
    }
}
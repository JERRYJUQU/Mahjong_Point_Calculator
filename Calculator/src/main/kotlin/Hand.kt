package src.main

import java.util.*

class Hand(temp_melds : Vector<Meld>, temp_full_hand : MutableList<Tile>){
    var melds = temp_melds
    var full_hand = temp_full_hand
    var points = 0

    // private function
    private fun eastMeld() : Meld{
        if (Meld(Tile.EAST, MeldType.GANG) in melds) {
            return Meld(Tile.EAST, MeldType.GANG, false)
        }
        else if (Meld(Tile.EAST, MeldType.PENG) in melds) {
            return Meld(Tile.EAST, MeldType.PENG, false)
        }
        else if (Meld(Tile.EAST, MeldType.PAIR) in melds) {
            return Meld(Tile.EAST, MeldType.PAIR, false)
        }
        else {
            var numOfCard = melds.{vector.iterator() == Meld(Tile.EAST, MeldType.PENG)}
        }
         = 0
        for (meld in melds) {
            if (meld.card == Tile.EAST) {
                when (meld.type){
                    MeldType.GANG -> return Meld(Tile.EAST, MeldType.GANG)
                    MeldType.PENG -> return Meld(Tile.EAST, MeldType.PENG)
                    MeldType.PAIR -> return Meld(Tile.EAST, MeldType.PAIR)
                    else -> numOfCard++
                }
            }
        }
        when (numOfCard) {
            4 -> throw FalseHandException()
            3 -> return Meld(Tile.EAST, MeldType.PENG, false)
            2 -> return Meld(Tile.EAST, MeldType.PAIR, false)
            1 -> return Meld(Tile.EAST, MeldType.CARD)
        }
        return Meld(Tile.INVALID, MeldType.CARD)
    }

    fun bigFourWinds() : Boolean{

    }
}
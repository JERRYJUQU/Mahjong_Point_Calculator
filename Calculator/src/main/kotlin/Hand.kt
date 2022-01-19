package src.main

import java.util.*

class Hand(temp_melds : Vector<Meld>, temp_full_hand : MutableList<Tile>){
    var melds = temp_melds
    var full_hand = temp_full_hand
    var points = 0
    public var score_book = ScoringTypes()

    private fun HasGang(tile : Tile) : Boolean {
        if (Meld(tile, MeldType.GANG) in melds) {
            return true
        }
        return false
    }

    private fun HasPeng(tile : Tile) : Boolean {
        val predicate : (Meld) -> Boolean = {it == Meld(tile, MeldType.CARD)}
        if (Meld(tile, MeldType.PENG) in melds) {
            return true
        }
        else if (melds.count(predicate) == 3){
            return true
        }
        return false
    }

    private fun HasPair(tile : Tile) : Boolean {
        val predicate : (Meld) -> Boolean = {it == Meld(tile, MeldType.CARD)}
        if (Meld(tile, MeldType.PAIR) in melds) {
            return true
        }
        else if (melds.count(predicate) == 2){
            return true
        }
        return false
    }

    fun bigFourWinds() : Boolean {
        if ((HasGang(Tile.EAST) || HasPeng(Tile.EAST)) &&
            (HasGang(Tile.WEST) || HasPeng(Tile.WEST)) &&
            (HasGang(Tile.NORTH) || HasPeng(Tile.NORTH)) &&
            (HasGang(Tile.SOUTH) || HasPeng(Tile.SOUTH))) {
            score_book.littleFourWinds.valid = false
            score_book.bigThreeWinds.valid = false
            score_book.allPungs.valid = false
            score_book.seatWind.valid = false
            score_book.prevalentWind.valid = false
            score_book.pungOfTerminalsOrHonours.valid = false
            return true
        }
        return false
    }

    fun bigThreeDragons() : Boolean {

    }
}
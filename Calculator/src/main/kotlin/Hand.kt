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
        if ((HasGang(Tile.RED) || HasPeng(Tile.RED)) &&
            (HasGang(Tile.GREEN) || HasPeng(Tile.GREEN)) &&
            (HasGang(Tile.WHITE) || HasPeng(Tile.WHITE))) {
            score_book.littleThreeDragons.valid = false
            score_book.dragonPung.valid = false
            score_book.twoDragonPungs.valid = false
            return true
        }
        return false
    }

    fun allGreen() : Boolean {
        for (meld in melds) {
            if ((meld.card !in
                        listOf(Tile.GREEN, Tile.BAMBOO_2, Tile.BAMBOO_3, Tile.BAMBOO_4, Tile.BAMBOO_6, Tile.BAMBOO_8) &&
                        (meld.type == MeldType.PENG ||
                                meld.type == MeldType.GANG ||
                                meld.type == MeldType.PAIR ||
                                meld.type == MeldType.CARD)) ||
                (meld.card != Tile.BAMBOO_2 &&
                        meld.type == MeldType.CHI)) {
                return false
            }
        }
        return true
    }

    fun nineGate() : Boolean {
        for (melds.count())
    }
}
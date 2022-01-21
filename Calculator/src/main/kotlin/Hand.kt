package src.main

import java.util.*

class Hand(temp_melds : Vector<Meld>){
    var melds = temp_melds
    var points = 0
    public var score_book = ScoringTypes()

    private fun hasGang(tile : Tile) : Boolean {
        if (Meld(tile, MeldType.GANG) in melds) {
            return true
        }
        return false
    }

    private fun hasPeng(tile : Tile) : Boolean {
        val predicate : (Meld) -> Boolean = {it == Meld(tile, MeldType.CARD)}
        if (Meld(tile, MeldType.PENG) in melds) {
            return true
        }
        else if (melds.count(predicate) == 3){
            return true
        }
        return false
    }

    private fun hasPair(tile : Tile) : Boolean {
        val predicate : (Meld) -> Boolean = {it == Meld(tile, MeldType.CARD)}
        if (melds.count(predicate) >= 2){
            return true
        }
        return false
    }

    fun bigFourWinds() : Boolean {
        if ((hasGang(Tile.EAST) || hasPeng(Tile.EAST)) &&
            (hasGang(Tile.WEST) || hasPeng(Tile.WEST)) &&
            (hasGang(Tile.NORTH) || hasPeng(Tile.NORTH)) &&
            (hasGang(Tile.SOUTH) || hasPeng(Tile.SOUTH))) {
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
        if ((hasGang(Tile.RED) || hasPeng(Tile.RED)) &&
            (hasGang(Tile.GREEN) || hasPeng(Tile.GREEN)) &&
            (hasGang(Tile.WHITE) || hasPeng(Tile.WHITE))) {
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
                                meld.type == MeldType.CARD)) ||
                (meld.card != Tile.BAMBOO_2 &&
                        meld.type == MeldType.CHI)) {
                return false
            }
        }
        return true
    }

    fun nineGate() : Boolean {
        var temp_meld = melds[1].card.value / 10

        //Check if all the cards are the same type: Bamboo/Dot/Character
        //Check if all the cards are concealed
        for (m in melds) {
            if (m.card.value / 10 != temp_meld || m.card.value < 10 || m.type != MeldType.CARD) {
                return false
            }
        }

        val predicate = {m : Meld, num : Int -> m.card.value % 10 == num}
        if (melds.count(predicate(1)) == 3)

        return true
    }
}
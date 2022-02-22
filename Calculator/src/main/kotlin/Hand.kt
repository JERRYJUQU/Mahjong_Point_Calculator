package src.main

import java.util.*

class Hand(temp_melds : Vector<Meld>){
    var melds = temp_melds
    var points = 0
    public var score_book = ScoringTypes()

    private fun hasGang(tile : Tile) : Boolean {
        if (Meld(tile, MeldType.GANG) in melds || Meld(tile, MeldType.CGANG) in melds) {
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
                                meld.type == MeldType.CGANG ||
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

        //Check if the first three card are ones and last three cards are nines
        if (melds[0].card.value % 10 != 1 ||
                melds[1].card.value % 10 != 1 ||
                melds[2].card.value % 10 != 1 ||
                melds[13].card.value % 10 != 9 ||
                melds[12].card.value % 10 != 9 ||
                melds[11].card.value % 10 != 9) {
            return false
        }

        var temp_count = false
        for (i in 4..11) {
            if (melds[i] == melds[i - 1]) {
                if (temp_count) return false
                temp_count = true
            }
        }

        return true
    }

    fun fourKongs() : Boolean {
        val predicate : (Meld) -> Boolean = {it.type == MeldType.GANG || it.type == MeldType.CGANG}
        if (melds.count(predicate) == 4) {
            return true
        }
        return false
    }

    fun sevenShiftedPairs() : Boolean {
        var i = 0
        while (i <= 12) {
            if (melds[i] != melds[i + 1]) {
                return false
            }
            i+=2
        }
        return true
    }

    fun thirteenOrphans() : Boolean {
        var temp_list = ArrayList<Tile>()
        for (m in melds) {
            if (m.type != MeldType.CARD || m.card !in listOf(Tile.DOT_1, Tile.DOT_9,
                    Tile.BAMBOO_1, Tile.BAMBOO_9, Tile.CHARACTER_1, Tile.CHARACTER_9, Tile.EAST,
                    Tile.WEST, Tile.NORTH, Tile.SOUTH, Tile.GREEN, Tile.RED, Tile.WHITE)) {
                return false
            }
            temp_list.add(m.card)
        }

        for (t in listOf(Tile.DOT_1, Tile.DOT_9,
            Tile.BAMBOO_1, Tile.BAMBOO_9, Tile.CHARACTER_1, Tile.CHARACTER_9, Tile.EAST,
            Tile.WEST, Tile.NORTH, Tile.SOUTH, Tile.GREEN, Tile.RED, Tile.WHITE)) {
            if (t !in temp_list) {
                return false
            }
        }
        return true
    }

    fun allTerminals() : Boolean {
        for (m in melds) {
            if (m.card.value < 10 || (m.card.value % 10 != 1 && m.card.value % 10 != 9)) {
                return false
            }
        }
        return true
    }

    fun littleFourWinds() : Boolean {

    }

    fun allHonours() : Boolean {
        for (m in melds) {
            if (m.card !in listOf(Tile.WHITE, Tile.GREEN, Tile.RED, Tile.EAST, Tile.WHITE, Tile.NORTH, Tile.SOUTH)) {
                return false
            }
        }
        return true
    }

    fun fourConcealedPungs() : Boolean {
        var numOfPungs = 0
        var curCard = Tile.INVALID
        var numOfRepeatedCard = 0
        for (i in 0 .. 14) {
            if (curCard == melds[i].card) {
                numOfRepeatedCard ++
                if (numOfRepeatedCard == 3) {
                    numOfPungs++
                }
            }
            else {
                numOfRepeatedCard = 0
                curCard = melds[i].card
            }
        }

        if (numOfPungs == 4) {
            return true
        }
        return false
    }

    fun pureTerminalChows() : Boolean {
        var meldNumList = listOf(melds.forEach())
    }
}
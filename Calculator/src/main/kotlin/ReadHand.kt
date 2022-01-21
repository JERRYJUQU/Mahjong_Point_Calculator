package src.main

import java.util.Scanner
import java.util.Vector

class ReadHand {
    private fun tileLookUp(value:Int):Tile {
        for (v in Tile.values()) {
            if (value == v.value) {
                return v
            }
        }
        return Tile.INVALID
    }

    private fun countHand(hand : Hand) : Boolean {
        var counter = 0
        for (meld in hand.melds) {
            if (meld.type == MeldType.CARD) {
                counter += 1
            }
            else {
                counter += 3
            }
        }
        if (counter != 14) {
            return false
        }
        return true
    }

    fun read() : Vector<Meld> {
        val reader = Scanner(System.`in`)
        var melds = Vector<Meld>()

        while(true) {
            println("NEXT INPUT(Card, Pair, Chi, Peng, Gang, Quit):")
            var inputType:String = reader.next()
            if (inputType == "Quit") {
                break
            }
            if(inputType !in listOf("Card", "Pair", "Chi", "Peng", "Gang", "Quit")) {
                println("INVALID INPUT!")
                continue
            }
            var type = MeldType.CARD
            when (inputType) {
                "Card" -> type = MeldType.CARD
                "PENG" -> type = MeldType.PENG
                "CHI"  -> type = MeldType.CHI
                "GANG" -> type = MeldType.GANG
            }
            var nextCard:Int = reader.nextInt()
            val result = tileLookUp(nextCard)
            if (result == Tile.INVALID) {
                println("INVALID TILE!")
                continue
            }
            var newMeld = Meld(result, type)
            melds.add(newMeld)
        }

        var numOfCards = 0

        melds.sortedWith(Comparator<Meld>{ a, b ->
            when {
                a.card.value > b.card.value -> 1
                b.card.value > a.card.value -> -1
                else -> 0
            }
        })



        for (meld in melds) {
            when (meld.type) {
                MeldType.CARD -> numOfCards += 1
                else -> numOfCards += 3
            }
        }
        if (numOfCards != 14) {
            throw Exception("INVALID NUMBER OF TILES IN HAND")
        }

        return melds
    }
}
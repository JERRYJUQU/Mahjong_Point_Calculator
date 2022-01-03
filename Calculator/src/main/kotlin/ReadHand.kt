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
        var counter : Int = 0
        for (meld in hand.melds) {
            if (meld.type == "Card") {
                counter += 1
            }
            else if (meld.type == "Pair") {
                counter += 2
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
            var type:String = reader.next()
            if (type == "Quit") {
                break
            }
            if(type !in listOf("Card", "Pair", "Chi", "Peng", "Gang", "Quit")) {
                println("INVALID INPUT!")
                continue
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

        for (meld in melds) {
            when (meld.type) {
                "Card" -> numOfCards += 1
                "Pair" -> numOfCards += 2
                else -> numOfCards += 3
            }
        }
        if (numOfCards != 14) {
            throw Exception("INVALID NUMBER OF TILES IN HAND")
        }
        return melds
    }
}
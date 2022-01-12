package src.main

import java.util.Vector

fun getFullHand(melds : Vector<Meld>) : MutableList<Tile>{
    var fullHand = mutableListOf<Tile>()

    for (m in melds) {
        if (m.type == "Card") {
            fullHand.add(m.card)
        }
        else if (m.type == "Pair") {
            fullHand.add(m.card)
            fullHand.add(m.card)
        }
        else if (m.type == "Chi") {
            fullHand.add(m.card)
            fullHand.add(m.card + 1)
            fullHand.add(m.card + 2)
        }
        else if (m.type == "Peng") {
            fullHand.add(m.card)
            fullHand.add(m.card)
            fullHand.add(m.card)
        }
        else if (m.type == "Gang") {
            fullHand.add(m.card)
            fullHand.add(m.card)
            fullHand.add(m.card)
        }
    }
    return fullHand
}

fun main() {
    val reader = ReadHand()
    var melds : Vector<Meld>
    try {
        melds = reader.read()
    }
    catch (e : Exception) {
        println(e.message)
        return
    }

    var fullHand = getFullHand(melds)

    val hand = Hand(melds, fullHand)
    val calculator = Calculator()
    calculator.calculate(hand)
}
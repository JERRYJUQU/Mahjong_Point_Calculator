package src.main

import java.util.Vector

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

    val hand = Hand(melds)
    val calculator = Calculator()
    calculator.calculate(hand)
}
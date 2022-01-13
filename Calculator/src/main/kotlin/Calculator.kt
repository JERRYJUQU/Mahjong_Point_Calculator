package src.main

import java.util.*

class Calculator {
    val score = ScoringTypes()

    fun calculate (hand : Hand) {
        if(hand.bigFourWinds()) {
            hand.points += score.bigFourWinds.point
        }
    }
}
package src.main

import java.util.*

class Calculator {
    val score = ScoringTypes()

    fun hasBigFourWinds(meld : Vector<Meld>) : Boolean{

    }

    fun calculate (hand : Hand) : Void {
        if (this.hasBigFourWinds(hand.melds)) {
            hand.points +=score
        }
        if (bigThreeDragons(hand.melds))
    }
}
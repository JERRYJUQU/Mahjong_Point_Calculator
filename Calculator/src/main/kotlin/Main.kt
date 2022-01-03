package src.main

import java.util.Vector

fun main() {
    val reader = ReadHand()
    val hand : Vector<Meld>
    try {
        reader.read()
    }
    catch (e : Exception) {
        println(e.message)
        return
    }
}
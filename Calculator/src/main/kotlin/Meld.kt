package src.main

open class Meld(tempCard : Tile, tempType : String) {
    var card:Tile = tempCard        //value of the meld
    var type:String = tempType      //Card/Pair/Chi/Peng/Gang
    var concealed = true
}

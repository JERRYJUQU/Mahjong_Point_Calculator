package src.main

open class Meld(tempCard : Tile, tempType : MeldType, tempConcealed : Boolean = true) {
    var card = tempCard        //value of the meld
    var type = tempType      //Chi/Peng/Gang/CGang

    init {
        if (type == MeldType.CHI &&
                card.value in listOf(-1, 1, 2, 3, 4, 7, 8, 9, 18, 19, 28, 29, 38, 39)) {
            throw FalseChiException()
        }
    }
}

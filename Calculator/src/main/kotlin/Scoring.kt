package src.main

class Scoring(val p : Int) {
    val point = p
    var count = true
}

class ScoringTypes {
    //88 points
    var bigFourWinds            = Scoring(88) //大四喜
    var bigThreeDragons         = Scoring(88) //大三元
    var allGreen                = Scoring(88) //绿一色
    var nineGates               = Scoring(88) //九莲宝灯
    var fourKongs               = Scoring(88) //四杠
    var sevenShiftedPairs       = Scoring(88) //连七对
    var thirteenOrphans         = Scoring(88)

    //64 points
    var allTerminals            = Scoring(64)
    var littleFourWinds         = Scoring(64)
    var littleThreeDragons      = Scoring(64)
    var allHonours              = Scoring(64)
    var fourConcealedPungs      = Scoring(64)
    var pureTerminalChows       = Scoring(64)

    //48 points
    var quadrupleChow           = Scoring(48)
    var fourPureShiftedPungs    = Scoring(48)

    //32 points
}
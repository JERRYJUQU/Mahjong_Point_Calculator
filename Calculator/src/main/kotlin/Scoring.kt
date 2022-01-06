package src.main

class Scoring(val p : Int) {
    val point = p
    var count = true
}

class ScoringTypes {
    //88 points
    var bigFourWinds                    = Scoring(88) //大四喜
    var bigThreeDragons                 = Scoring(88) //大三元
    var allGreen                        = Scoring(88) //绿一色
    var nineGates                       = Scoring(88) //九莲宝灯
    var fourKongs                       = Scoring(88) //四杠
    var sevenShiftedPairs               = Scoring(88) //连七对
    var thirteenOrphans                 = Scoring(88)

    //64 points
    var allTerminals                    = Scoring(64)
    var littleFourWinds                 = Scoring(64)
    var littleThreeDragons              = Scoring(64)
    var allHonours                      = Scoring(64)
    var fourConcealedPungs              = Scoring(64)
    var pureTerminalChows               = Scoring(64)

    //48 points
    var quadrupleChow                   = Scoring(48)
    var fourPureShiftedPungs            = Scoring(48)

    //32 points
    var fourPureShiftedChows            = Scoring(32)
    var threeKongs                      = Scoring(32)
    var allTerminalsAndHonours          = Scoring(32)

    //24 points
    var sevenPairs                      = Scoring(24)
    var greaterHonoursAndKnittedTiles   = Scoring(24)
    var allEenPungs                     = Scoring(24)
    var fullFlushable                   = Scoring(24)
    var pureTripleChow                  = Scoring(24)
    var pureShiftedPungs                = Scoring(24)
    var upperTiles                      = Scoring(24)
    var middleTiles                     = Scoring(24)
    var lowerTiles                      = Scoring(24)

    //16 points
    var pureStraight                    = Scoring(16)
    var threeSuitedTerminalChows        = Scoring(16)
    var pureShiftedChows                = Scoring(16)
    var allFives                        = Scoring(16)
    var triplePung                      = Scoring(16)
    var threeConcealedPungs             = Scoring(16)

    //12 points
    var lesserHonoursAndKnittedTiles    = Scoring(12)
    var knittedStraight                 = Scoring(12)
    var upperFour                       = Scoring(12)
    var lowerFour                       = Scoring(12)
    var bigThreeWinds                   = Scoring(12)

    //8 points
    var mixedStraight                   = Scoring(8)
    var reversibleTiles                 = Scoring(8)
    var mixedTripleChow                 = Scoring(8)
    var mixedShiftedPungs               = Scoring(8)
    var chickenHand                     = Scoring(8)
    var lastTileDraw                    = Scoring(8)
    var lastTileClaim                   = Scoring(8)
    var outWithReplacementTile          = Scoring(8)
    var robKong                         = Scoring(8)
    var twoConcealedKongs               = Scoring(8)

    //6 points
    var allPungs                        = Scoring(6)
    var halfFlushable                   = Scoring(6)
    var mixedShiftedChows               = Scoring(6)
    var allTypes                        = Scoring(6)
    var meldedHand                      = Scoring(6)
    var twoDragonPungs                  = Scoring(6)

    //4 points
    var outsideHand                     = Scoring(4)
    var fullyConcealedHand              = Scoring(4)
    var twoMeldedKongs                  = Scoring(4)
    var lastTile                        = Scoring(4)

    //2 points
    var dragonPung                      = Scoring(2)
    var prevalentWind                   = Scoring(2)
    var seatWind                        = Scoring(2)
    var concealedHand                   = Scoring(2)
    var allChows                        = Scoring(2)
    var tileHog                         = Scoring(2)
    var mixedDoublePung                 = Scoring(2)
    var twoConcealedPungs               = Scoring(2)
    var concealedKong                   = Scoring(2)
    var allSimple                       = Scoring(2)

    //1 point
    var pureDoubleChow                  = Scoring(1)
    var mixedDoubleChow                 = Scoring(1)
    var shortStraight                   = Scoring(1)
    var twoTerminalChows                = Scoring(1)
    var pungOfTerminalsOrHonours        = Scoring(1)
    var meldedKong                      = Scoring(1)
    var oneVoidedSuit                   = Scoring(1)
    var noHonours                       = Scoring(1)
    var edgeWait                        = Scoring(1)
    var closedWait                      = Scoring(1)
    var singleWait                      = Scoring(1)
    var selfDraw                        = Scoring(1)
}
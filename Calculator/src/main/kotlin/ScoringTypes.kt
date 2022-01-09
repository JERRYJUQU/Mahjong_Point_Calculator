package src.main

class ScoringTypes {
    //88 points
    var bigFourWinds                    = Scoring(88) //大四喜
    var bigThreeDragons                 = Scoring(88) //大三元
    var allGreen                        = Scoring(88) //绿一色
    var nineGates                       = Scoring(88) //九莲宝灯
    var fourKongs                       = Scoring(88) //四杠
    var sevenShiftedPairs               = Scoring(88) //连七对
    var thirteenOrphans                 = Scoring(88) //十三幺

    //64 points
    var allTerminals                    = Scoring(64) //清幺九
    var littleFourWinds                 = Scoring(64) //小四喜
    var littleThreeDragons              = Scoring(64) //小三元
    var allHonours                      = Scoring(64) //全字
    var fourConcealedPungs              = Scoring(64) //四暗刻
    var pureTerminalChows               = Scoring(64) //一色双龙会

    //48 points
    var quadrupleChow                   = Scoring(48) //一色四同顺
    var fourPureShiftedPungs            = Scoring(48) //一色四节高

    //32 points
    var fourPureShiftedChows            = Scoring(32) //一色四步高
    var threeKongs                      = Scoring(32) //三杠
    var allTerminalsAndHonours          = Scoring(32) //混幺九

    //24 points
    var sevenPairs                      = Scoring(24) //七对子
    var greaterHonoursAndKnittedTiles   = Scoring(24) //七星不靠
    var allEenPungs                     = Scoring(24) //全双刻
    var fullFlushable                   = Scoring(24) //清一色
    var pureTripleChow                  = Scoring(24) //一色三同顺
    var pureShiftedPungs                = Scoring(24) //一色三节高
    var upperTiles                      = Scoring(24) //全大
    var middleTiles                     = Scoring(24) //全中
    var lowerTiles                      = Scoring(24) //全小

    //16 points
    var pureStraight                    = Scoring(16) //清龙
    var threeSuitedTerminalChows        = Scoring(16) //三色双龙会
    var pureShiftedChows                = Scoring(16) //一色三步高
    var allFives                        = Scoring(16) //全带五
    var triplePung                      = Scoring(16) //三同刻
    var threeConcealedPungs             = Scoring(16) //三暗刻

    //12 points
    var lesserHonoursAndKnittedTiles    = Scoring(12) //全不靠
    var knittedStraight                 = Scoring(12) //组合龙
    var upperFour                       = Scoring(12) //大于五
    var lowerFour                       = Scoring(12) //小于五
    var bigThreeWinds                   = Scoring(12) //三风刻

    //8 points
    var mixedStraight                   = Scoring(8) //花龙
    var reversibleTiles                 = Scoring(8) //推不倒
    var mixedTripleChow                 = Scoring(8) //三色三同顺
    var mixedShiftedPungs               = Scoring(8) //三色三节高
    var chickenHand                     = Scoring(8) //无番和
    var lastTileDraw                    = Scoring(8) //妙手回春
    var lastTileClaim                   = Scoring(8) //海底捞月
    var outWithReplacementTile          = Scoring(8) //杠上开花
    var robKong                         = Scoring(8) //抢杠和
    var twoConcealedKongs               = Scoring(8) //双暗杠

    //6 points
    var allPungs                        = Scoring(6) //碰碰和
    var halfFlushable                   = Scoring(6) //混一色
    var mixedShiftedChows               = Scoring(6) //三色三步高
    var allTypes                        = Scoring(6) //五门齐
    var meldedHand                      = Scoring(6) //全求人
    var twoDragonPungs                  = Scoring(6) //双箭刻

    //4 points
    var outsideHand                     = Scoring(4) //全带幺
    var fullyConcealedHand              = Scoring(4) //不求人
    var twoMeldedKongs                  = Scoring(4) //双明杠
    var lastTile                        = Scoring(4) //绝张和

    //2 points
    var dragonPung                      = Scoring(2) //箭刻
    var prevalentWind                   = Scoring(2) //圈风刻
    var seatWind                        = Scoring(2) //门风刻
    var concealedHand                   = Scoring(2) //门前清
    var allChows                        = Scoring(2) //平和
    var tileHog                         = Scoring(2) //四归一
    var mixedDoublePung                 = Scoring(2) //双同刻
    var twoConcealedPungs               = Scoring(2) //双暗刻
    var concealedKong                   = Scoring(2) //暗杠
    var allSimple                       = Scoring(2) //断幺

    //1 point
    var pureDoubleChow                  = Scoring(1) //一般高
    var mixedDoubleChow                 = Scoring(1) //喜相逢
    var shortStraight                   = Scoring(1) //连六
    var twoTerminalChows                = Scoring(1) //老少副
    var pungOfTerminalsOrHonours        = Scoring(1) //幺九刻
    var meldedKong                      = Scoring(1) //明杠
    var oneVoidedSuit                   = Scoring(1) //缺一门
    var noHonours                       = Scoring(1) //无字
    var edgeWait                        = Scoring(1) //边张
    var closedWait                      = Scoring(1) //坎张
    var singleWait                      = Scoring(1) //单钓将
    var selfDraw                        = Scoring(1) //自摸
}
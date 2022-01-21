package src.main.test
import src.main.Meld
import src.main.MeldType
import src.main.Tile
import java.util.Vector
import kotlin.test.Test
import kotlin.test.assertEquals

internal class HandTest {
    private val meld1 = Meld(Tile.EAST, MeldType.GANG)
    private val meld2 = Meld(Tile.EAST, MeldType.PENG)
    private val meld4 = Meld(Tile.EAST, MeldType.CARD)

    private val meld5 = Meld()

    private val testHand1 = Vector<Meld>()
    private val testHand2 = Vector<Meld>()
    testHand1.addAll(listOf(Meld()))

    @Test
    fun testBigFourWinds() {
        val Expected1 = true
        assertEquals(Expected1, )
    }
}
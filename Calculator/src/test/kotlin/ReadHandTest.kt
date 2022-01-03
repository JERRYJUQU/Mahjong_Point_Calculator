import org.junit.jupiter.api.Test
import src.main.ReadHand
import kotlin.test.assertEquals

class ReadHandTest {
    @Test
    internal fun testNumOfCards() {
        val reader = ReadHand()
        val hand = reader.read()
        var counter = 0

        for (meld in hand) {
            when (meld.type) {
                "Card" -> counter += 1
                "Pair" -> counter += 2
                else -> counter += 3
            }
        }
        assertEquals(14, counter)
    }
}
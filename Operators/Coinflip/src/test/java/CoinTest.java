import org.junit.jupiter.api.Test;
import org.mockito.internal.util.reflection.FieldSetter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CoinTest {

//    private Coin coin = new Coin();

    private Coin coin = new Coin();

    public void set(Coin mockedCoin) {
    }

    @Test
    public void returnsHeadWhenGivenZeroPoint50() {
        assertEquals("Heads", coin.flip());
    }

    @Test
    void returnsTailWhenGivenZeroPoint6() {
        assertEquals("Tails", coin.flip());
    }

}
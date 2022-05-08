package learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerTest {

    @Test
    public void test() {
        assertEquals(8, Power.pow(2, 3));
    }

}

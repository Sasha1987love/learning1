package learning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgressionTest {

    @Test
    public void test() {
        assertEquals(6, Progression.sum(3));
    }

    @Test
    public void test2() {
        assertEquals(6, Progression.sum_2(3));
    }


}

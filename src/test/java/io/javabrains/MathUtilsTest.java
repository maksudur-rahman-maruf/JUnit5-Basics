package io.javabrains;

import io.javabrains.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int expected = 4;
        int actual = mathUtils.add(2, 2);
        assertEquals(expected, actual, "The add method should add two numbers");
    }
}

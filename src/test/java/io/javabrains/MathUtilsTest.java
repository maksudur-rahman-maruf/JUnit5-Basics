package io.javabrains;

import io.javabrains.MathUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    @DisplayName("Testing Add Method")
    void testAdd() {
        int expected = 4;
        int actual = mathUtils.add(2, 2);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The computeCircleArea should calculate circle area");
    }

    @Test
    @Disabled
    @DisplayName("TDD Method...Should not run")
    void testDisable() {
        fail("This test should be disabled");
    }
}

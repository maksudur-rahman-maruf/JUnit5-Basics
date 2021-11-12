package io.javabrains;

import io.javabrains.MathUtils;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When running MathUtils")
public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }


    @Nested
    @DisplayName("add method")
    class AddTest {
        @Test
        @DisplayName("When adding two positive numbers")
        void testAddPositive() {
            assertEquals(4, mathUtils.add(2, 2), "should return the right sum");
        }

        @Test
        @DisplayName("When adding two negative numbers")
        void testAddNegative() {
            assertEquals(-4, mathUtils.add(-2, -2), "should return the right sum");
        }
    }


    @Test
    @DisplayName("Testing Multiply Method")
    void testMultiply() {
        assertAll(
                () -> assertEquals(2, mathUtils.multiply(2, 1)),
                () -> assertEquals(4, mathUtils.multiply(2, 2)),
                () -> assertEquals(-2, mathUtils.multiply(2, -1))
        );
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0));
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The computeCircleArea should calculate circle area");
    }

//    @Test
//    @Disabled
//    @DisplayName("TDD Method...Should not run")
//    void testDisable() {
//        fail("This test should be disabled");
//    }
}

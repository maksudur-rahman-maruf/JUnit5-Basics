package io.javabrains;

import io.javabrains.MathUtils;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS) // New Instance Created Per Class; Default was Per Method/Test
public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    void beforeAllInit() {
        System.out.println("This needs to run before all");
    }

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup() {
        System.out.println("Cleaning up....");
    }

    @Test
    void testAdd() {
        int expected = 4;
        int actual = mathUtils.add(2, 2);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0) );
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The computeCircleArea should calculate circle area");
    }
}

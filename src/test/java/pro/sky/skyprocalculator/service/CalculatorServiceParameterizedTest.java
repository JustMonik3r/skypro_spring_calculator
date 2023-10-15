package pro.sky.skyprocalculator.service;

import pro.sky.skyprocalculator.TestUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {
    private final CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> addParams() {
        return Stream.of(
                Arguments.of("2", "2", TestUtils.formatResult(2, 2, "+", String.valueOf(2 + 2))),
                Arguments.of("109", "2", TestUtils.formatResult(109, 2, "+", String.valueOf(109 + 2))),
                Arguments.of("20", "112", TestUtils.formatResult(20, 112, "+", String.valueOf(20 + 112))),
                Arguments.of("6", "6", TestUtils.formatResult(6, 6, "+", String.valueOf(6 + 6)))
        );
    }

    public static Stream<Arguments> substractParams() {
        return Stream.of(
                Arguments.of("2", "2", TestUtils.formatResult(2, 2, "-", String.valueOf(2 - 2))),
                Arguments.of("16", "5", TestUtils.formatResult(16, 5, "-", String.valueOf(16 - 5))),
                Arguments.of("25", "9", TestUtils.formatResult(25, 9, "-", String.valueOf(25 - 9))),
                Arguments.of("72", "37", TestUtils.formatResult(72, 37, "-", String.valueOf(72 - 37)))
        );
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of("2", "2", TestUtils.formatResult(2, 2, "*", String.valueOf(2 * 2))),
                Arguments.of("14", "5", TestUtils.formatResult(14, 5, "*", String.valueOf(14 * 5))),
                Arguments.of("9", "0", TestUtils.formatResult(9, 0, "*", String.valueOf(9 * 0))),
                Arguments.of("512", "2", TestUtils.formatResult(512, 2, "*", String.valueOf(512 * 2)))
        );
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of("2", "2", TestUtils.formatResult(2, 2, "/", String.valueOf((double)2 / 2))),
                Arguments.of("4", "3", TestUtils.formatResult(4, 3, "/", String.valueOf((double)4 / 3))),
                Arguments.of("50", "1", TestUtils.formatResult(50, 1, "/", String.valueOf((double)50 / 1))),
                Arguments.of("0", "5", TestUtils.formatResult(0, 5, "/", String.valueOf((double)0 / 5)))
        );
    }

    @ParameterizedTest
    @MethodSource("addParams")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.add(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("substractParams")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.substract(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}

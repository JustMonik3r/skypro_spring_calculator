package pro.sky.skyprocalculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculator.exceptions.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {


    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();


    @Test
    void calculator() {
        //Входные данные

        //Ожидаемый результат
        String expectedMessage = "<b>Добро пожаловать в калькулятор!</b>";
        //Начало теста
        String actualMessage = calculatorServiceImpl.calculator();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void add_shouldReturnPositiveNum_Num1AndNum2ArePositive() {
        //Входные данные
        int num1 = 23;
        int num2 = 76;
        //Ожидаемый результат
        String expectedResult = num1 + " + " + num2 + " = " + (num1 + num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void add_2_shouldReturnNegativeNum_Num1IsPositive_Num2IsNegative() {
        //Входные данные
        int num1 = 45;
        int num2 = -46;
        //Ожидаемый результат
        String expectedResult = num1 + " + " + num2 + " = " + (num1 + num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void substract_shouldReturnPositiveNum_Num1AndNum2ArePositive() {
        //Входные данные
        int num1 = 74;
        int num2 = 29;
        //Ожидаемый результат
        String expectedResult = num1 + " - " + num2 + " = " + (num1 - num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.substract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void substract_2_shouldReturnNegativeNum_Num1AndNum2ArePositive() {
        //Входные данные
        int num1 = 28;
        int num2 = 29;
        //Ожидаемый результат
        String expectedResult = num1 + " - " + num2 + " = " + (num1 - num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.substract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void substract_3_shouldReturnPositiveNum_Num1AndNum2AreNegative() {
        //Входные данные
        int num1 = -28;
        int num2 = -29;
        //Ожидаемый результат
        String expectedResult = num1 + " - " + num2 + " = " + (num1 - num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.substract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_shouldReturnPositiveNum_Num1AndNum2ArePositive() {
        //Входные данные
        int num1 = 25;
        int num2 = 5;
        //Ожидаемый результат
        String expectedResult = num1 + " * " + num2 + " = " + (num1 * num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_2_shouldReturnNegativeNum_Num1IsPositive_Num2IsNegative() {
        //Входные данные
        int num1 = 6;
        int num2 = -5;
        //Ожидаемый результат
        String expectedResult = num1 + " * " + num2 + " = " + (num1 * num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_3_shouldReturnPositiveNum_Num1IsNegative_Num2IsNegative() {
        //Входные данные
        int num1 = -75;
        int num2 = -4;
        //Ожидаемый результат
        String expectedResult = num1 + " * " + num2 + " = " + (num1 * num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_shouldReturnPositiveNum_Num1AndNum2ArePositive() {
        //Входные данные
        int num1 = 44;
        int num2 = 5;
        //Ожидаемый результат
        String expectedResult = num1 + " / " + num2 + " = " + ((double)num1 / num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_2_shouldReturnNegativeNum_Num1IsPositive_Num2IsNegative() {
        //Входные данные
        int num1 = 44;
        int num2 = -5;
        //Ожидаемый результат
        String expectedResult = num1 + " / " + num2 + " = " + ((double)num1 / num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_3_shouldReturnPositiveNum_Num1IsNegative_Num2IsNegative() {
        //Входные данные
        int num1 = -5;
        int num2 = -10;
        //Ожидаемый результат
        String expectedResult = num1 + " / " + num2 + " = " + ((double)num1 / num2);
        //Начало теста
        String actualResult = calculatorServiceImpl.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_shouldThrowAnException() {
        //Входные данные
        int num1 = 1;
        int num2 = 0;

        //Ожидаемый результат
        String expectedMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(
                DivideByZeroException.class,
                () -> calculatorServiceImpl.divide(num1, num2)
        );
        assertEquals(expectedMessage, exception.getMessage());
    }
}
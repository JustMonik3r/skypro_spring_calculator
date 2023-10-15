package pro.sky.skyprocalculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.skyprocalculator.exceptions.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {


    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();


    @Test
    void calculator() {
        //Входные данные
        String expectedMessage = "<b>Добро пожаловать в калькулятор!</b>";
        //Ожидаемый результат
        String actualMessage = calculatorServiceImpl.calculator();
        //Начало теста
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void add() {
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
    void substract() {
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
    void multiply() {
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
    void divide() {
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
    void divide_withException() {
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
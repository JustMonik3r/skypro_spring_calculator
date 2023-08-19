package pro.sky.skyprocalculator;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String add(Integer num1, Integer num2) {
        String result = "Сложение: " + num1 + " + " + num2 + " = " + (num1 + num2);
        return check(num1, num2, result);
    }

    public String substract(Integer num1, Integer num2) {
        String result = "Вычитание: " + num1 + " - " + num2 + " = " + (num1 - num2);
        return check(num1, num2, result);
    }

    public String multiply(Integer num1, Integer num2) {
        String result = "Умножение: " + num1 + " * " + num2 + " = " + (num1 * num2);
        return check(num1, num2, result);
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        } else {
            String result = "Деление: " + num1 + " / " + num2 + " = " + (num1 / num2);
            return check(num1, num2, result);
        }
    }

    public String check(Integer num1, Integer num2, String result) {
        if (num1 == null || num2 == null) {
            throw new ArithmeticException("Введены не все данные!");
        } else {
            return result;
        }
    }
}

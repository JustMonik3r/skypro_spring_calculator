package pro.sky.skyprocalculator.service;
import org.springframework.stereotype.Service;
import pro.sky.skyprocalculator.exceptions.DivideByZeroException;
import pro.sky.skyprocalculator.exceptions.NotEnoughDataException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String add(Integer num1, Integer num2) {
        return formatResult(num1, num2, "+", Integer.toString(num1 + num2));
    }

    public String substract(Integer num1, Integer num2) {
        return formatResult(num1, num2, "-", Integer.toString(num1 - num2));
    }

    public String multiply(Integer num1, Integer num2) {
        return formatResult(num1, num2, "*", Integer.toString(num1 * num2));
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("На ноль делить нельзя!");
        } else {
            return formatResult(num1, num2, "/", Double.toString((double) num1 / num2));
        }
    }

    public String formatResult(Integer num1, Integer num2, String operation, String result) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughDataException("Введены не все данные!");
        } else {
            return String.format("%s %s %s = %s", num1, operation, num2, result);
        }
    }

}

package pro.sky.skyprocalculator;

import pro.sky.skyprocalculator.exceptions.NotEnoughDataException;

public class TestUtils {
    public static String formatResult(Integer num1, Integer num2, String operation, String result) {
        if (num1 == null || num2 == null) {
            throw new NotEnoughDataException("Введены не все данные!");
        } else {
            return String.format("%s %s %s = %s", num1, operation, num2, result);
        }
    }
}

package pro.sky.skyprocalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @RequestMapping("/calculator")
    public String calculator() {
        return calculatorService.calculator();
    }

    @RequestMapping(path = "/calculator/add")
    public String add (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.add(num1,num2);
    }

    @RequestMapping(path = "/calculator/substract")
    public String substract (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.substract(num1,num2);
    }

    @RequestMapping(path = "/calculator/multiply")
    public String multiply (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.multiply(num1,num2);
    }

    @RequestMapping(path = "/calculator/divide")
    public String divide (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.divide(num1,num2);
    }
}

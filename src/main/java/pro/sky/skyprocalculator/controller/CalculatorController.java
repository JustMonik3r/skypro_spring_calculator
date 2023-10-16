package pro.sky.skyprocalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprocalculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController (CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String calculator() {
        return calculatorService.calculator();
    }

    @GetMapping("/add")
    public String add (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.add(num1,num2);
    }

    @GetMapping("/substract")
    public String substract (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.substract(num1,num2);
    }

    @GetMapping("/multiply")
    public String multiply (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public String divide (@RequestParam(required = false) Integer num1, Integer num2) {
        return calculatorService.divide(num1,num2);
    }
}

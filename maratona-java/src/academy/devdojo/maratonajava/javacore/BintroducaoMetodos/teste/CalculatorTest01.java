package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculator;

public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("----------------------");
        calculator.sumTwoNumbers();
        System.out.println("----------------------");
        calculator.subtractTwoNumbers();
        System.out.println("----------------------");
        calculator.multipliesTwoNumbers(2, 4);
        System.out.println("----------------------");
        double result = calculator.dividedTwoNumbers(4, 2);
        System.out.println(result);


    }
}

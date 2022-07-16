package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculator;

public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        System.out.println("----------------------");
        calculator.subtractTwoNumbers();
        System.out.println("----------------------");
        calculator.multipliesTwoNumbers(2, 4);
    }
}


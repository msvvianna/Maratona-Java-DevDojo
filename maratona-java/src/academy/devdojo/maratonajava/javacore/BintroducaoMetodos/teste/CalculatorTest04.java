package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculator;

public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        calculator.changeTwoNumbers(a, b);
        System.out.println("In changeTwoNumber");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);


    }
}

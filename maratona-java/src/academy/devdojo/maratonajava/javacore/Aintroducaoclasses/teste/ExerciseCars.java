package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Cars;

public class ExerciseCars {
    public static void main(String[] args) {
        Cars carsOne = new Cars();
        Cars carsTwo = new Cars();

        carsOne.name = "Ferrari";
        carsOne.model = "Sport";
        carsOne.age = 2013;

        carsTwo.name = "Audi";
        carsTwo.model = "Sport";
        carsTwo.age = 2013;

        System.out.println("Name: " + carsOne.name + " Model: " + carsOne.model + " Age: " + carsOne.age);
        System.out.println("-----------------------------------------------");
        System.out.println("Name: " + carsTwo.name + " Model: " + carsTwo.model + " Age: " + carsTwo.age);
    }
}

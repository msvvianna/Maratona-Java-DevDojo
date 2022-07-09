package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        int[] numbersTwo = {1,2,3,4,5}; //another way to declare and initialize arrays
        int[] numbersThree = new int []{5,4,3,2,1}; //another way to declare and initialize arrays

        for (int i = 0; i < numbersThree.length; i++) {
            System.out.println(numbersThree[i]);
        }
        // foreach
        for (int num:numbersThree) {
            System.out.println(num);
        }
    }
}

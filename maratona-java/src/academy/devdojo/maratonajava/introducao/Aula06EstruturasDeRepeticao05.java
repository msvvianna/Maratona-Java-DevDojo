package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //given a value of a car, find out how many installments it can be financed
        // condition installment value must be less than or equal to 1000
        double amount = 30000;
        for (int portion = (int)amount; portion >= 1; portion--) {
            double valuePortion = amount / portion;
            if (valuePortion < 1000) {
                continue;
            }
            System.out.println("Portion " + portion + " R$ " + valuePortion);
        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 70000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double valueTax;
        if (annualSalary <= 34712){
            valueTax = annualSalary * firstTrack;
        }else if (annualSalary >= 34713 && annualSalary <= 68507) {
            valueTax = annualSalary * secondTrack;
        }else {
            valueTax = annualSalary * thirdTrack;
        }

        System.out.println(valueTax);


    }
}

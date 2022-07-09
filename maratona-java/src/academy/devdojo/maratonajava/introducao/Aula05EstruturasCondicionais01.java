package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedBuyDrink = age >= 18;

        if (isAuthorizedBuyDrink) {
            System.out.println("Authorized to buy drink");
        }else{
            System.out.println("No authorized to buy drink");
        }

        if(!isAuthorizedBuyDrink){
            System.out.println("No authorized to buy drink");
        }
    }
}

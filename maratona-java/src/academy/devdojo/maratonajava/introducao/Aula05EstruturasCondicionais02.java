package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 kids
        // age >= 15 && < 18 juvenile
        // age >= 18 adult

        int age = 19;
        String category;

        if(age < 15) {
            category = "Category Kids";
        }else if(age >=15 && age <18){
            category = "Category Juvenile";
        }else{
            category = "Category adult";
        }
        System.out.println(category);
    }
}

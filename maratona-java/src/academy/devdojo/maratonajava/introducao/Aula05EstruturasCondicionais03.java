package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Donate if salary > 5000
        double salary = 3000;
        String messageDonate = "I will donate 500 to the Devdojo";
        String messageNoDonate = "I still don't have conditions to donate, but I will";
        //(condition) ? true : false
        String result = salary > 5000 ? messageDonate : messageNoDonate;
        System.out.println(result);

        //OR WITHOUT NEED TO DECLARE THE VARIABLES messageDonate and messageNoDonate

        String result_ = salary > 5000 ? "I will donate 500 to the Devdojo" : "I still don't have conditions to donate, but I will";
        System.out.println(result_);
    }
}

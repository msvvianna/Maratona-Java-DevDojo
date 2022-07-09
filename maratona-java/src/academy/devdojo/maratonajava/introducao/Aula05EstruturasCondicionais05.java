package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Print the day of week, considering 1 as sunday
        byte day = 5;
        // char, int, byte, short, enum, String
        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        char sex = 'M';
        switch (sex) {
            case 'M':
                System.out.println("Man");
                break;
            case 'F':
                System.out.println("Woman");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}

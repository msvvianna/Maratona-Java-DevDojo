package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Goku";
        names[1] = "Kurosaki";
        names[2] = "Luffy";
        names[3] = "Hinata";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //print the first 25 numbers of a given value
        int valueMax = 50;
        for (int i = 0; i <= valueMax ; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}

package academy.devdojo.maratonajava.introducao;

/*
Pratica
Crie variavel para os campos descritos abaixo <> e imprima a seguinte msg:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario> na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String name = "Marcos Santana Viana";
        String address = "Rua Osvaldo Orico 10";
        double salary = 10000.25;
        String data = "29/06/2022";
        String report = "Eu "+name+ ", morando no endereço "+address+ ", confirmo que recebi o salario " +salary+ " na data "+data;

        System.out.println(report);
    }

}

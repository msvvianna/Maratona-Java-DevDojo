package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.teste;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.PrintStudent;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        PrintStudent print = new PrintStudent();

        student1.name = "Midoriya";
        student1.age = 15;
        student1.sex = 'F';

        student2.name = "Lufty";
        student2.age = 18;
        student2.sex = 'M';

        print.print(student1);
        print.print(student2);
    }
}

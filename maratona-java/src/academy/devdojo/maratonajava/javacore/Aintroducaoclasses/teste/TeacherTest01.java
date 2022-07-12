package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;
import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        teacher.name = "Mestre Kami";
        teacher.age = 140;
        teacher.sex = 'M';
        System.out.println("Name: " + teacher.name + " age: " + teacher.age + " sex: " + teacher.sex);
    }
}

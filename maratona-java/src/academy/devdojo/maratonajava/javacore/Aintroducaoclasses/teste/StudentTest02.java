package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Sanji";
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.sex);

        System.out.println("--------------------------");

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.sex);
    }
}

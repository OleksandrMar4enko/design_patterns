package creationalPatterns.prototype.example;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {

        StudentPrototype prototype = new StudentPrototype();
        prototype.setStudent(new Student(1, "Student"));

        Student student = prototype.getStudent();
        System.out.println(student);

        Student student2 = prototype.getStudent();
        System.out.println(student2);
    }
}

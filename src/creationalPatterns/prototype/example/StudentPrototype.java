package creationalPatterns.prototype.example;

public class StudentPrototype {

    private Student student;

    public Student getStudent() throws CloneNotSupportedException {
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

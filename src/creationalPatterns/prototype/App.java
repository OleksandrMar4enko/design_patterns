package creationalPatterns.prototype;

public class App {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode");

        System.out.println(master);

        Project masterClone = (Project) master.copy();
        System.out.println("=======================");
        System.out.println(masterClone);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone2 = factory.cloneProject();
        System.out.println("=======================");
        System.out.println(masterClone2);

    }
}

package creationalPatterns.abstractFactory.banking;

import creationalPatterns.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("BankingPM is managing banking project...");
    }
}

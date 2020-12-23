package creationalPatterns.abstractFactory;

import creationalPatterns.abstractFactory.banking.BankingTeamFactory;

public class BankSystem {

    public static void main(String[] args) {
        TeamFactory teamFactory = new BankingTeamFactory();
        Developer developer = teamFactory.getDeveloper();
        Tester tester = teamFactory.getTester();
        ProjectManager projectManager = teamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}

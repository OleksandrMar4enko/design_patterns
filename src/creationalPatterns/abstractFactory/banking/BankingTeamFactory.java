package creationalPatterns.abstractFactory.banking;

import creationalPatterns.abstractFactory.Developer;
import creationalPatterns.abstractFactory.ProjectManager;
import creationalPatterns.abstractFactory.TeamFactory;
import creationalPatterns.abstractFactory.Tester;

public class BankingTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}

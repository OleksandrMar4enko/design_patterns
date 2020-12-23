package creationalPatterns.abstractFactory.banking;

import creationalPatterns.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("javaDeveloper is writing code...");
    }
}

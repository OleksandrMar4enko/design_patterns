package creationalPatterns.factoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new Javadeveloper();
    }
}

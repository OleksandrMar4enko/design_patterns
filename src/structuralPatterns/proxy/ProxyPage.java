package structuralPatterns.proxy;

public class ProxyPage implements Page {

    private RealPage realPage;
    private String url;

    public ProxyPage(String url) {
        this.url = url;
    }

    @Override
    public void displayPage() {
        if (realPage == null) {
            realPage = new RealPage(url);
        }
        realPage.displayPage();
    }
}

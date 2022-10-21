package Class23;

public interface HMW02_WebDriver {

    /* Create a WebDriver Interface that will have the following unimplemented behaviour:
       openBrowser(), closeBrowser(), maximizeWindow(), findElement().
       Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */

    public void openBrowser();
    public void closeBrowser();
    public void maximizeWindow();
    public void findElement();

}

class ChromeDriver implements HMW02_WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("It opens chrome browser.");
    }

    @Override
    public void closeBrowser() {
        System.out.println("It close chrome browser.");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("It maximize the chrome webpage window.");
    }

    @Override
    public void findElement() {
        System.out.println("It find the chrome element.");
    }
}

class FirefoxDriver implements HMW02_WebDriver {


    @Override
    public void openBrowser() {
        System.out.println("It opens FirFox browser.");
    }

    @Override
    public void closeBrowser() {
        System.out.println("It close FirFox browser.");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("It maximize the FirFox  webpage window.");
    }

    @Override
    public void findElement() {
        System.out.println("It find the FirFox element.");
    }

    public static void main(String[] args) {

        HMW02_WebDriver webDriver = new ChromeDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();

        System.out.println("***************************");

        HMW02_WebDriver webDriver1 = new FirefoxDriver();
        webDriver1.openBrowser();
        webDriver1.closeBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();

    }
}
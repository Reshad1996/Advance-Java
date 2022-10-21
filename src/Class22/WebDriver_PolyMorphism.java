package Class22;

public class WebDriver_PolyMorphism {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void test(){
        System.out.println("perform testing");
    }
    public void closeBrowser(){
        System.out.println("closing browser");
    }
}

class Chrome extends WebDriver_PolyMorphism {
    public void startBrowser(){
        System.out.println("Starting the  chrome");
    }
    public void test(){
        System.out.println("perform testing on  Chrome");
    }
    public void closeBrowser(){
        System.out.println("closing google Chrome ");
    }
}

class Firefox extends WebDriver_PolyMorphism {
    public void startBrowser(){
        System.out.println("Starting the Firefox browser");
    }
    public void test(){
        System.out.println("perform testing on Firefox");
    }
    public void closeBrowser(){
        System.out.println("closing Firefox browser");
    }
}

class Safari extends WebDriver_PolyMorphism {
    public void startBrowser(){
        System.out.println("Starting the Safari");
    }
    public void test(){
        System.out.println("perform testing on Safari");
    }
    public void closeBrowser(){
        System.out.println("closing Safari");
    }
}


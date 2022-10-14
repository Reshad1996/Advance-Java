package Class21;

public class OverRide_Browser {

    void openBrowser() {
        System.out.println("Opening a Browser");
    }
    void navigate() {
        System.out.println("Opening the URL");
    }
    void test() {
        System.out.println("Testing the webpage");
    }
    void closeBrowser() {
        System.out.println("Closing a Browser");
    }
}

class Chrome extends OverRide_Browser {

    void openBrowser() {
        System.out.println("Opening a Browser in a less than 1 sec");
    }
}

class Firefox extends OverRide_Browser {

    void openBrowser() {
        System.out.println("Opening a Browser in a less than 2 sec");
    }
}

class Browser_Tester {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        chrome.openBrowser();
        chrome.closeBrowser();
    }
}
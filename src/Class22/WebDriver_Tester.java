package Class22;

public class WebDriver_Tester {

    public static void main(String[] args) {

      /*  Safari safari = new Safari();
        safari.startBrowser();
        safari.test();
        safari.closeBrowser();

        Chrome chrome = new Chrome();
        chrome.startBrowser();
        chrome.test();
        chrome.closeBrowser();

        Firefox firefox = new Firefox();
        firefox.startBrowser();
        firefox.test();
        firefox.closeBrowser(); */

        // instead of creating the object of the class everytime we use polymorphism

        WebDriver_PolyMorphism[] browsers={new Chrome(),new Safari(),new Firefox()};
        for (WebDriver_PolyMorphism browser:browsers ) {
            browser.startBrowser();
            browser.test();
            browser.closeBrowser();
        }

        System.out.println("*********************************************");
         // other way

        for (int i = 0; i < browsers.length ; i++) {
            browsers[i].startBrowser();
            browsers[i].test();
            browsers[i].closeBrowser();

        }
    }

     /*  Chrome chrome = new Chrome();
        Firefox firefox = new Firefox();
        Safari safari = new Safari();
        WebDriver_PolyMorphism [] browser = {chrome,firefox,safari}; */

        /* creating object of all child classes and storing them in an array of
           type WebDriver we can do this because upcasting allow us to do this
         */
}

package framework;

import pages.HeadingPage;

public class PageFactory extends LoggerClass {

    public static HeadingPage headingPage;

    public static void setInstanceOfPage() {
        headingPage = new HeadingPage();
    }

    public static HeadingPage getHeadingPage() {
        return headingPage;
    }

}

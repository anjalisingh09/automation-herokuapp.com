package tests;

import framework.BaseClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HeadingTest extends BaseClass {

    @Test
    void printHeading() {
        Assertions.assertEquals("Welcome to the-internet", getHeadingPage().displayHeading());

    }

    @Test
    void addOrDeleteElement() {
        Assertions.assertEquals("Add/Remove Elements", getHeadingPage().addOrRemoveElement());

    }
}
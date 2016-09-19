package com.example;

import com.example.domain.navigator.NavigatorService;
import com.example.domain.navigator.NavigatorServiceExample;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;


/**
 * JUnit tests for navigator service
 * Created by Jakub Tucek on 19.09.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/application-context-mock.xml"})
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NavigatorTest {

    @Autowired
    private NavigatorService navigatorService;

    public NavigatorTest() {
    }


    @Test
    public void test1DI() {
        Assert.notNull(navigatorService);

        Assert.isTrue(navigatorService.getClass() == NavigatorServiceExample.class);
    }

    @Test
    public void test2ReturnValues() {
        String page = navigatorService.getRandomPage();
        Assert.isTrue(page.equals("pages/random-pages/random-page2")
                || page.equals("pages/random-pages/random-page1"));
    }

}

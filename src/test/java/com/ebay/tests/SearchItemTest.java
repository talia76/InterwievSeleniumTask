package com.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchItemPositiveTest() {
        app.getSelect().clickOnDepartmentLink("3");
        app.getSelect().selectSection("1");
        app.getSelect().selectBrand("Apple ");
        String secondItemName = app.getItem().getSecondItemName("2");
        //System.out.println(secondItemName);
        app.getItem().enterItemNameToSearchBar(secondItemName);
        String firstItemName = app.getItem().getFirstItemName("1");
        //System.out.println(firstItemName);
        Assert.assertEquals(firstItemName, secondItemName);

    }
}

   /*   Select section ‘Handys & Smartphones’
        Select ‘Apple’
        Remember second element in search results
        Enter the memorized value in the search bar
        Find and check that the product name matches the stored value

        Conditions:

        Provide parameterization of test data
        The execution result should be a log
        The source code of the project must be posted on github or bitbucket*/



























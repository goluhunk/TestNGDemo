package org.gaurav;

import org.testng.annotations.Test;

public class PriorityDemo {
    @Test(priority = 2)
    public void closeBrowser(){
        System.out.println("close browser !");
    }

    @Test(priority =1)
    public void openBrowser(){
        System.out.println("open browser !");
    }

}

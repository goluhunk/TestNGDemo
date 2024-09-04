package org.gaurav;

import org.testng.annotations.Test;

public class dependsOnMethod {

    @Test(dependsOnMethods={"openBrowser"})
    public void signIn(){
        System.out.println("This is sign in method");
    }

    @Test
    public void openBrowser(){
        System.out.println("This is open browser method");
    }

    @Test(dependsOnMethods = {"openBrowser","signIn"})
    public void logOut(){
        System.out.println("This is logout method");
    }
}

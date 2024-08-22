package org.gaurav;

import org.testng.annotations.Test;

public class HomeLoanTest {
    @Test(groups = {"sanity"})
    public void WebLoginHomeLoan(){
        System.out.println("Web Login of Home Loan");
    }
    @Test
    public void APILoginHomeLoan(){
        System.out.println("API Login of Home Loan");
    }
    @Test
    public void MobileLoginHomeLoan(){
        System.out.println("Mobile Login of Home Loan");
    }
}

package org.gaurav;

import org.testng.annotations.Test;

public class CarLoanTest {
    @Test(groups = {"sanity"})
    public void WebLoginCarLoan(){
        System.out.println("Web Login of Car Loan");
    }
    @Test(groups = {"regression"})
    public void APILoginCarLoan(){
        System.out.println("API Login of Car Loan");
    }
    @Test(groups = {"smoke"})
    public void MobileLoginCarLoan(){
        System.out.println("Mobile Login of Car Loan");
    }
}

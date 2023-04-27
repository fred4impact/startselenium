package Tests;


import bank.Bank;
import org.testng.annotations.Test;

public class TestBank {

    // call the call instantiate the class
      Bank barclays; // an intance of bank
      Bank Metro;
//    Bank halifax;
//    Bank scotBank;




    @Test
    public void testCreateAnewBank(){
        barclays = new Bank("Barcalys", "Greg", "09876543");
        barclays.transfer();
        barclays.branch();


        Metro = new Bank("Metro BANK", "LEGYS", "123226373");
        Metro.branch();
        Metro.transfer();



    }


}

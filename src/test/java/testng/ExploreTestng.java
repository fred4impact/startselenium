package testng;

import org.testng.annotations.*;

public class ExploreTestng {


    @BeforeSuite  // Collection  of all our tests together in a folder
    public void setUp(){
        System.out.println(" Actions before suits runs driver set up ");
    }

    @BeforeClass  // any action before a class
    public void anythingBeforeClass(){
        System.out.println("run configuration  action before class runs ");
    }

      ////  simply it   the annotation help to depict all activites that need to happen before a test runs or after a test runs

    @BeforeTest  // any actions before test
    public void openApplication(){
        System.out.println("Application  actions befoer a test run  ");
    }


    @BeforeMethod  // any action before method
    public void method(){
        System.out.println("GOT TO HOME AND CLICK HOME BUTTON  ");
    }


    @Test(testName = "userlogin", priority = 4)  // Testcase 1
    public void verifyUsercanCreateAccount(){
        System.out.println(" Testcase 1 Login wih valid user ");
    }

    @Test(testName = "userLogout", priority = 1)   // Testcase 2
    public void VerifyUserCanlogin(){
        System.out.println(" Testacase 2  logout using the logOut button");
    }

    @Test(testName = "LOGOUT", priority = 2) // Testcase 3
    public void verifyUsercanlogOut(){
        System.out.println(" Testcase 3 ");
    }

    @Test(testName = "dASHBOARD", priority = 3)  // Testcase 3
    public void verifyUserDasbord(){
        System.out.println(" Testcase 3  user can see tha dash board ");
    }


    @AfterMethod   // what happen after a method
    public void aftermethod(){
        System.out.println("BACK FROM HOME BUTTON  ");
    }



    @AfterTest
    public void closeApplication(){
        System.out.println("Application shotdown : Actions after a test runs ");
    }



    @AfterClass
    public void anythingAfterClass(){
        System.out.println("Happen before class : actions after a class runs ");
    }


    @AfterSuite
    public void aftersuite(){
        System.out.println("actions after  a suite runs ");
    }















}

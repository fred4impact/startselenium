package useObjects;

import restuarant.Restuarant;

public class TestingObject {

    /*
     for you to use a class or create an instance or Object of a class,
      1. call or inport the class you want to use
      2. create a variable our of the class
      3.set the varible name to the new instance of teh class
     */
    public  Restuarant Deliveroo; //  we create an instance of retaurant here
            Restuarant justeat = new Restuarant(); // we create an instance and set it to the new object
    public void testObjectRestuarant(){
        Deliveroo = new Restuarant();
        Deliveroo.branch();
        justeat.branch();
        justeat.eatIn();
    }



}

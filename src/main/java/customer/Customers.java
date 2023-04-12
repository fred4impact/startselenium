package customer;

public class Customers { // customer  objects

    // variable what is variable is just a placeholder for a value
    // name, address, phone, age, picture, sex
    // dataType variablename = assign value to the variable
    String name = "";  // variable declaration without value
    String name2 = "Jon";
    String address = "no 10 page sstreet";
    int phone = 292020202;
    int age = 20;
    String pictureuRL  = "www.com";
    String sex = "Male";
    boolean isRegistered = false;
   //    float floatNumber;
   //    char charT;
    // access modifiers public, private , protected
   // functions. behaviour, method // what function can this customer do?
    // buyGoods, openAccount, login,

    public void buyGoods(){  // methods / fucntions/ behaviours
        System.out.println(" this customer can buy goods");
    }

    public void openAccount(){
        System.out.println(" this customer can open an account");
    }

    public void login(){
        System.out.println(" this customer can open an account");
    }








}// END OF THE CLASS

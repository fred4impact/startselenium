package bank;

public class Bank {

        // variable and declare them
         String name;
         String owner;
         String regCode;

        // Constroctors
        public  Bank(String name, String owner, String regCode ){
            this.name = name;
            this.owner = owner;
            this.regCode = regCode;
        }


        // methods  any functions that we can perform within a bank

        public void transfer(){
            System.out.println(name + " I can make a transfer");
        }

        public void branch(){
            System.out.println(name + " This bank can make transfer");
        }





}

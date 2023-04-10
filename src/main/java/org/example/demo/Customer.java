package org.example.demo;

public class Customer {

    private Register register;

    public void setRegister(Register register) {
        this.register = register;
    }

    public void registerAccount() {


        if (register.registerToAccount()){

            System.out.println("Customer is registered");

        } else{
            System.out.println("Customer is not registered");
        }


    }
}

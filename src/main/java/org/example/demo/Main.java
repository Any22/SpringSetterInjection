package org.example.demo;

public class Main {
    public static void main(String[] args) {

        Register register = new CurrentAccount();
        Customer customer = new Customer();

        customer.setRegister(register);
        customer.registerAccount();
    }
}
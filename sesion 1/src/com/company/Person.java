package com.company;

import java.util.List;

// Controller
// Service
// Entity -> Spring
// Lombok -> Getter y Setter
public abstract class Person {  // Upper Camel Case  -> Singular

    private String firstName; // lower camel case
    private String LastName;
    private List<Account> accounts;

    public Person() {
    }

    public Person(String firstName, String lastName, List<Account> accounts) {
        this.firstName = firstName;
        LastName = lastName;
        this.accounts = accounts;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }


}

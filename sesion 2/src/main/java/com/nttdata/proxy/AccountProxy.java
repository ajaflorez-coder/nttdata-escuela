package com.nttdata.proxy;

import com.nttdata.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AccountProxy {
  public Stream<Account> accountsGet() {
    List<Account> accounts = new ArrayList<>();
    accounts.add(new Account(1, "123-45678-9", "Cuenta Free", 1));
    accounts.add(new Account(2, "122-45455-9", "Cuenta Sueldo", 1));
    accounts.add(new Account(3, "123-45679-9", "Cuenta Free", 2));
    accounts.add(new Account(4, "124-45214-9", "Cuenta Clasica", 3));
    accounts.add(new Account(5, "123-99584-9", "Cuenta Free", 4));
    accounts.add(new Account(6, "124-35678-9", "Cuenta Clasica", 4));
    accounts.add(new Account(7, "122-12312-9", "Cuenta Sueldo", 4));
    return accounts.stream();
  }
}

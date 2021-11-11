package com.nttdata.service;

import com.nttdata.model.Account;
import com.nttdata.model.Person;
import com.nttdata.proxy.AccountProxy;
import com.nttdata.repository.PersonRepository;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class OperationService {

  private PersonRepository personRepository;
  private AccountProxy accountProxy;

  public OperationService() {
    personRepository = new PersonRepository();
    accountProxy = new AccountProxy();
  }

  public void getPeople() {
    List<Person> people = personRepository.getAll();
    // CLasica
    /*for (Person person : people) {
      System.out.println(person);
    }*/
    // lambda 1
    //people.forEach(person -> System.out.println(person) );
    // lambda 2
    people.forEach(person -> {
      System.out.print(person.getId() + " ");
      System.out.println(person.getLastName());
    });
    // lambda 3
    people.forEach(System.out::println);

  }
  public void getPersonById(Integer id) {
    personRepository.getAll().stream()
        .filter(person -> person.getId().equals(id))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public void getAccount() {
    accountProxy.accountsGet()
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public void getAccountById(Integer id) {
    accountProxy.accountsGet()
        .filter(account -> account.getId().equals(id))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public void getAccountByPersonId(Integer id) {
    accountProxy.accountsGet()
        .filter(account -> account.getPersonId().equals(id))
        .filter(account -> account.getDescriptionAccount().length() > 11)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
  public void getLengthLastNamePerson() {
    /*
    personRepository.getAll().stream()
        .map(person -> person.getLastName())
        .map(s -> s.length())
        .collect(Collectors.toList())
        .forEach(System.out::println);
     */
    personRepository.getAll().stream()
        .map(Person::getLastName)
        .map(String::length)
        .map(integer -> integer + 1)
        .filter(integer -> integer > 10)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
  public void getConcatNamePerson() {
    personRepository.getAll().stream()
        .map(person -> concatName(person.getFirstName(), person.getLastName()))
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
  public void getConcatPerson() {
    personRepository.getAll().stream()
        .map(OperationService::concatPerson)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
  public String concatName(String firstName, String lastName) {
    return String.join(" ", firstName, lastName);
  }
  public static String concatPerson(Person person) {
    return String.join(" ", person.getFirstName(), person.getLastName());
  }

  Comparator<Account> comparator
      = (Account a1, Account a2) -> a1.getNumberAccount().compareTo(a2.getNumberAccount());
  public void getNumberAccountOrder() {
    accountProxy.accountsGet()
        .sorted(comparator)
        .map(OperationService::getNumberAccountPersonId)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }
  public static String getNumberAccountPersonId(Account account) {
    return String.join(" : ", account.getPersonId().toString(), account.getNumberAccount());
  }

  public void getAccountGroupingByPerson() {
    Map<Integer, List<Account>> groupAccount
      = accountProxy.accountsGet()
        .collect(Collectors.groupingBy(Account::getPersonId));

    System.out.println(groupAccount);
  }
  public void getAccountSummaryByPerson(Integer id) {
    IntSummaryStatistics summary = accountProxy.accountsGet()
        .filter(account -> account.getPersonId().equals(id))
        .collect(Collectors.summarizingInt(Account::getId));
    System.out.println(summary);
  }

  public void getSumAccount() {
    Optional<Integer> suma = accountProxy.accountsGet()
        .filter(account -> account.getPersonId().equals(4))
        .map(account -> account.getId())
        .reduce(Integer::sum);

    if (suma.isPresent()) {
      System.out.println(suma.get());
    } else {
      System.out.println("No hay respuesta");
    }
  }
}

package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lists;
        lists = new ArrayList<>();  // Reactive

        lists.add("Carlos");
        lists.add("Jose");
        lists.add("Maria");

        Calculate calculate = new Calculate();
        calculate.printName(lists);

        /*Person person = new Person();
        person.setFirstName("Carlos");*/

        // Declaración
        Person carlos;
        Person maria;
        Person student;
        Customer rosa;

        // Instanciación
        carlos = new Customer();
        maria = new Employee();
        student = new CustomerTeenager();
        rosa = new CustomerTeenager();

        Customer customer = new Customer();
        Employee employee = new Employee();

        Prestamo prestamo = new Prestamo();
        prestamo.prestar(carlos);
        prestamo.prestar(maria);
        prestamo.prestar(student);
        prestamo.prestar(rosa);

        // Account Examples------------------------------------
        AccountClassic accountClassic = new AccountClassic();
        Depositos accountPremium = new AccountPremium();

        AccountFree accountFree = new AccountFree();
        AccountPremium accountPremium2 = new AccountPremium();
        AccountTeenager accountTeenager = new AccountTeenager();

        Audit audit = new Audit();
        audit.auditAccountDepositos(accountClassic);
        audit.auditAccountDepositos(accountPremium);
        audit.auditAccountDepositos(accountTeenager);
        audit.auditAccountOnLine(accountFree);
        audit.auditAccountOnLine(accountTeenager);
        audit.auditAccountRetiros(accountPremium2);
        audit.auditAccountOnLine(accountPremium2);

        // Example Exceptions ------
        EntityRepository entityRepository;
        entityRepository = new EntityRepositoryImpl();

        try {
            entityRepository.Connect("xx:yy:zzz", "postgres", "password");
            entityRepository.select("Select * from ....");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            entityRepository.insert("Insert into  ....");
        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}

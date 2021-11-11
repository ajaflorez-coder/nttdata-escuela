package com.nttdata;

import com.nttdata.service.OperationService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        OperationService operationService = new OperationService();
        //operationService.getPeople();
        //operationService.getAccount();
        //operationService.getAccountById(5);
        //operationService.getAccountByPersonId(4);
        //operationService.getPersonById(2);
        //operationService.getLengthLastNamePerson();
        //operationService.getConcatNamePerson();
        //operationService.getConcatPerson();
        //operationService.getNumberAccountOrder();
        //operationService.getAccountGroupingByPerson();
        //operationService.getAccountSummaryByPerson(4);
        operationService.getSumAccount();

    }
}

package com.company;

public class AccountFree extends Account implements OnLine{
    @Override
    public void tranferencia() {
        OnLine.super.tranferencia();
    }

    @Override
    public void pagos() {

    }
}

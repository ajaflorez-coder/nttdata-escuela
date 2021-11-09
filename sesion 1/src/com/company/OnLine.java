package com.company;

public interface OnLine {
    default void tranferencia() {
        System.out.println("Transfirio");
    }
    void pagos();
}

package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Calculate {
    public void sumar() {
        BigDecimal big = new BigDecimal(3.25);
        Double num1 = Double.valueOf(1725.53);
        BigDecimal num = new BigDecimal(0);
        for (int i = 0; i < 10; i++) {
            num = num.add(BigDecimal.valueOf(num1));
        }
        System.out.println(num);
    }
    
    public void printName(List<String> lists) {
        for (String item : lists) { // Reactive -> map
            System.out.println(item);
        }
    }
}

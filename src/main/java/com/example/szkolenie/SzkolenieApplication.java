package com.example.szkolenie;


import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class SzkolenieApplication {
    public static void main(String[] args) {

        char itemFirstCharacter = 'i';
        System.out.println(itemFirstCharacter);

        boolean enabled = false;
        System.out.println(enabled);

        Boolean bigBoolean = null;
        bigBoolean = TRUE;

        int itemsNumberInt = 53000;
        System.out.println(itemsNumberInt);

        long itemsNumberLong = 72036854775807L;
        System.out.println(itemsNumberLong);

        double itemsNumberDouble = 4.99;
        System.out.println(itemsNumberDouble);

        Integer number = 42; // Automatyczne opakowanie int w Integer
        int value = number;
        System.out.println(value);




//





        Polimorfizm polimorfizm= new Polimorfizm();
        List<InterfaceRachunek>  interfaceRachunekList= new ArrayList<>();
        interfaceRachunekList.add(new RachunekFirmowy());
        interfaceRachunekList.add(new RachunekOsobisty());
        polimorfizm.wyswietlRodzajRachunku(interfaceRachunekList);


    }

}

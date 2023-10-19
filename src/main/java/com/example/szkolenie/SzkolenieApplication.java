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

        String slowo = "Slowo";
        String slowoZMalejLitery=  slowo.toLowerCase();

        Calculator calculator = new Calculator();
        int kwota = calculator.add(1, 1);






        Rachunek rachunekAdama = new Rachunek("123", 100);
        Rachunek rachunekAlicji = new Rachunek("345", 1000);

        System.out.println("rachunekAdama " + rachunekAdama.getStanKonta());
        System.out.println("rachunekAlicji " + rachunekAlicji.getStanKonta());

        rachunekAlicji.wykonajPrzelewWychodzacy(1001);
        rachunekAlicji.doladujKontoOkreslonaSumaPieniedzy(100);
        System.out.println("rachunekAlicji po doladowaniu " + rachunekAlicji.getStanKonta());
        rachunekAlicji.wykonajPrzelewWychodzacy(1001);



        Rachunek.zablokujWszystkieRachunkiWBanku();
        rachunekAlicji.wykonajPrzelewWychodzacy(10);
        rachunekAdama.wykonajPrzelewWychodzacy(10);




        RachunekZMozliwosciaWzieciaKredytu rachunekZMozliwosciaWzieciaKredytu= new RachunekZMozliwosciaWzieciaKredytu("345",1000,5000);
        rachunekZMozliwosciaWzieciaKredytu.dodajNowyKredyt(4000);
        rachunekZMozliwosciaWzieciaKredytu.dodajNowyKredyt(2000);


      //  rachunekAdama.dodajNowyKredyt()


        WszystkieRachunkiWBanku wszystkieRachunkiWBanku=new WszystkieRachunkiWBanku();
        wszystkieRachunkiWBanku.dodajRachunekWBanku("123",100);
        wszystkieRachunkiWBanku.dodajRachunekWBanku("1234",1000);
        wszystkieRachunkiWBanku.wyswietlWszytkieNumeryRachunkowWBanku();


        Polimorfizm polimorfizm = new Polimorfizm();
        List<InterfaceRachunek> interfaceRachunekList = new ArrayList<>();
        interfaceRachunekList.add(new RachunekFirmowy());
        interfaceRachunekList.add(new RachunekOsobisty());
        polimorfizm.wyswietlRodzajRachunku(interfaceRachunekList);


    }

}

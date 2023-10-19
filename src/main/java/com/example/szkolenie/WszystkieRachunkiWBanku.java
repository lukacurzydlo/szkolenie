package com.example.szkolenie;

import java.util.ArrayList;
import java.util.List;

public class WszystkieRachunkiWBanku {

    private final List<Rachunek> wszystkieRachunkiWBanku = new ArrayList<>();

    public void dodajRachunekWBanku(String numerRachunku, int stanKonta) {
        Rachunek rachunek = new Rachunek(numerRachunku, stanKonta);
        wszystkieRachunkiWBanku.add(rachunek);
        System.out.println("Obecna liczba rachunkow w banku wynosi : " + wszystkieRachunkiWBanku.size());
    }

    public void wyswietlWszytkieNumeryRachunkowWBanku() {
        for (Rachunek rachunek : wszystkieRachunkiWBanku) {
            String numerRachunku= rachunek.getNumerRachunku();
            System.out.println(numerRachunku);
        }












//        for (int i = 0; i < wszystkieRachunkiWBanku.size(); i++) {
//            System.out.println(wszystkieRachunkiWBanku.get(i).getNumerRachunku());
//        }

    }


}

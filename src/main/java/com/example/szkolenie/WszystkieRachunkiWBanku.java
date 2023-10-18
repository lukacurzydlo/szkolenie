package com.example.szkolenie;

import java.util.ArrayList;
import java.util.List;

public class WszystkieRachunkiWBanku {

    private final List<RachunekBezKredytowy> wszystkieRachunkiWBanku = new ArrayList<>();

    public void dodajRachunekWBanku(String numerRachunku, int stanKonta) {
        RachunekBezKredytowy rachunekBezKredytowy = new RachunekBezKredytowy(numerRachunku, stanKonta);
        wszystkieRachunkiWBanku.add(rachunekBezKredytowy);
        System.out.println("Obecna liczba rachunkow w banku wynosi : " + wszystkieRachunkiWBanku.size());
    }

    public void wyswietlWszytkieNumeryRachunkowWBanku() {
        for (RachunekBezKredytowy rachunekBezKredytowy : wszystkieRachunkiWBanku) {
            String numerRachunku= rachunekBezKredytowy.getNumerRachunku();
            System.out.println(numerRachunku);
        }

//        for (int i = 0; i < wszystkieRachunkiWBanku.size(); i++) {
//            System.out.println(wszystkieRachunkiWBanku.get(i).getNumerRachunku());
//        }

    }


}

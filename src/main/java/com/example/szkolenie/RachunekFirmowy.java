package com.example.szkolenie;

public class RachunekFirmowy implements InterfaceRachunek {

    private String adresFirmy;
    @Override
    public void wyswietlRodzajRachunku() {
        System.out.println("Rachunek Firmowy");
    }

    public String getAdresFirmy() {
        return adresFirmy;
    }
}

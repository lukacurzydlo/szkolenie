package com.example.szkolenie;

import java.util.List;

public class Polimorfizm {

    public  void wyswietlRodzajRachunku(List<InterfaceRachunek> interfacesRachunek) {
        for(InterfaceRachunek interfaceRachunek:interfacesRachunek) {
            interfaceRachunek.wyswietlRodzajRachunku();
        }
    }

}

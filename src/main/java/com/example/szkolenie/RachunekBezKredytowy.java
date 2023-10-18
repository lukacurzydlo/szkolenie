package com.example.szkolenie;


import java.util.Objects;

public class RachunekBezKredytowy
 //       implements InterfaceRachunek
{

    private static boolean blokadaWszystkichRachunkowWBanku;
    private String numerRachunku;
    private int stanKonta;

    public RachunekBezKredytowy(String numerRachunku, int stanKonta) {
        this.numerRachunku = numerRachunku;
        this.stanKonta = stanKonta;
    }

    public void wykonajPrzelew(int wartoscPrzelewu){
        if(blokadaWszystkichRachunkowWBanku){
            System.out.println("Wszystkie rachunki w banku sa zablokowane, wykonanie przelewu jest niemozliwe");
            return;
        }

        if(wartoscPrzelewu>stanKonta){
            System.out.println("Przelew odrzucony z uwagi na zbyt malo srodkow");
        }

        else{
            stanKonta =stanKonta-wartoscPrzelewu;
            System.out.println("Przelew wykonany, na koncie zostalo "+stanKonta);
        }

    }

    public static void zablokujWszystkieRachunkiWBanku(){
        blokadaWszystkichRachunkowWBanku=true;
    }

    public String getNumerRachunku() {
        return numerRachunku;
    }















    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RachunekBezKredytowy rachunekBezKredytowy = (RachunekBezKredytowy) o;
        return Objects.equals(numerRachunku, rachunekBezKredytowy.numerRachunku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerRachunku);
    }
}

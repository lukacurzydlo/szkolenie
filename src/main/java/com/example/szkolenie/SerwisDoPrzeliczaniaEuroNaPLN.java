package com.example.szkolenie;

public class SerwisDoPrzeliczaniaEuroNaPLN {

    public SerwisDoPrzeliczaniaEuroNaPLN(SerwisDoPobieraniaWartosciEuro serwisDoPobieraniaWartosciEuro) {
        this.serwisDoPobieraniaWartosciEuro = serwisDoPobieraniaWartosciEuro;
    }

    private SerwisDoPobieraniaWartosciEuro serwisDoPobieraniaWartosciEuro;

    public int obliczWartoscWPlnDlaPodanejKwotyEuro(int kwotaWEuro){
       int aktualnaWartoscEuro= serwisDoPobieraniaWartosciEuro.pobierzAktualnaWartoscEuroDlaZlotego();
       return kwotaWEuro * aktualnaWartoscEuro;
    }
}

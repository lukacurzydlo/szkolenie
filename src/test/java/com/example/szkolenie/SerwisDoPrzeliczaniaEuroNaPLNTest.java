package com.example.szkolenie;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class SerwisDoPrzeliczaniaEuroNaPLNTest {

    private SerwisDoPobieraniaWartosciEuro serwisDoPobieraniaWartosciEuro= Mockito.mock(SerwisDoPobieraniaWartosciEuro.class);

    private SerwisDoPrzeliczaniaEuroNaPLN serwisDoPrzeliczaniaEuroNaPLN =new SerwisDoPrzeliczaniaEuroNaPLN(serwisDoPobieraniaWartosciEuro);


    @Test
    public void testGetAllBooks() {

        when(serwisDoPobieraniaWartosciEuro.pobierzAktualnaWartoscEuroDlaZlotego()).thenReturn(4);

        int kwotaEuro = serwisDoPrzeliczaniaEuroNaPLN.obliczWartoscWPlnDlaPodanejKwotyEuro(2);

        verify(serwisDoPobieraniaWartosciEuro, times(1)).pobierzAktualnaWartoscEuroDlaZlotego();

        assertEquals(kwotaEuro,8);

    }

}

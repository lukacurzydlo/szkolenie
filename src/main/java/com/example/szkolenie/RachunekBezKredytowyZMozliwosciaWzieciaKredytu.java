package com.example.szkolenie;

public class RachunekBezKredytowyZMozliwosciaWzieciaKredytu extends RachunekBezKredytowy {

    private int limitKredytuDoWziecia;

    public RachunekBezKredytowyZMozliwosciaWzieciaKredytu(String numerRachunku, int stanKonta, int limitKredytuDoWziecia) {
        super(numerRachunku, stanKonta);
        limitKredytuDoWziecia = limitKredytuDoWziecia;
    }

    public int getLimitKredytuDoWziecia() {
        return limitKredytuDoWziecia;
    }
}

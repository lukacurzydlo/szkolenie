package com.example.szkolenie;


public class RachunekZMozliwosciaWzieciaKredytu extends Rachunek {

    private int przydzielonyLimitKredytu;
    private int wzietyKredyt;

    public RachunekZMozliwosciaWzieciaKredytu(String numerRachunku, int stanKonta, int przydzielonyLimitKredytu) {
        super(numerRachunku, stanKonta);
        this.przydzielonyLimitKredytu = przydzielonyLimitKredytu;
    }

    public void dodajNowyKredyt(int wartoscNowegoKredytu){
       int  nowaWartoscKredytu=this.wzietyKredyt+wartoscNowegoKredytu;
        if(nowaWartoscKredytu>przydzielonyLimitKredytu){
            System.out.println("Nie mozna wziac nowego kredytu poniewaz przekroczony zotal limit");
        }
        else{
            System.out.println("Po wzieciu nowego kredytu calkowity kredyt wynosi : "+nowaWartoscKredytu);
            this.wzietyKredyt=nowaWartoscKredytu;
        }
    }
}

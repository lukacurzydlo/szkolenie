package com.example.szkolenie;


public class RachunekZMozliwosciaWzieciaKredytu extends Rachunek {

    private int przydzielonyKredytLimitu;
    private int wzietyKredyt;

    public RachunekZMozliwosciaWzieciaKredytu(String numerRachunku, int stanKonta, int przydzielonyKredytLimitu) {
        super(numerRachunku, stanKonta);
        przydzielonyKredytLimitu = przydzielonyKredytLimitu;
    }

    public int getPrzydzielonyKredytLimitu() {
        return przydzielonyKredytLimitu;
    }

    public void setPrzydzielonyKredytLimitu(int przydzielonyKredytLimitu) {
        this.przydzielonyKredytLimitu = przydzielonyKredytLimitu;
    }

    public void dodajNowyKredyt(int wartoscNowegoKredytu){
       int  calkowityKredyt=wzietyKredyt+wartoscNowegoKredytu;
        if(calkowityKredyt>przydzielonyKredytLimitu){
            System.out.println("Nie mozna wziac nowego kredytu poniewaz przekroczony zotal limit");
        }
        else{
            System.out.println("Po wzieciu nowego kredytu calkowity kredyt wynosi : "+calkowityKredyt);
            wzietyKredyt=calkowityKredyt;
        }
    }
}

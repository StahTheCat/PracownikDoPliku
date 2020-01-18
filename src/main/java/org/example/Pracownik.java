package org.example;

public class Pracownik {

    String imieNazwisko;
    double wynagrodzenie;


    public String getImieNazwisko() {
        return imieNazwisko;
    }

    public double getWynagrodzenie() {
        return wynagrodzenie;
    }

    public Pracownik(String imieNazwisko, double wynagrodzenie) {
        this.imieNazwisko = imieNazwisko;
        this.wynagrodzenie = wynagrodzenie;
    }
}

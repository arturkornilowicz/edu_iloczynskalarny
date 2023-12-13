package wektory;

import liczby.Liczba;

import java.util.List;

public class Wektor<T extends Liczba> {

    private List<T> dane;

    public Wektor(List<T> dane) {
        this.dane = dane;
    }

    public Liczba min() {
        if (dane.size() > 0) {
            Liczba wynik = dane.get(0);
            for (int i = 1; i < dane.size(); i++) {
                if (dane.get(i).porownaj(wynik) < 0) {
                    wynik = dane.get(i);
                }
            }
            return wynik;
        }
        return null;
    }

    public Liczba max() {
        if (dane.size() > 0) {
            Liczba wynik = dane.get(0);
            for (int i = 1; i < dane.size(); i++) {
                if (dane.get(i).porownaj(wynik) > 0) {
                    wynik = dane.get(i);
                }
            }
            return wynik;
        }
        return null;
    }
    @Override
    public String toString() {
        return dane.toString();
    }
}

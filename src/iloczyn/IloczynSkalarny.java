package iloczyn;

import liczby.*;

import java.util.List;

public class IloczynSkalarny<T extends Liczba> {

    private T zero;
    private List<T> v1;
    private List<T> v2;

    public IloczynSkalarny (List<T> v1, List<T> v2, T zero) {
        this.v1 = v1;
        this.v2 = v2;
        this.zero = zero;
    }

    public Liczba iloczyn() {
        Liczba wynik = zero;
        for (int i = 0; i < v1.size(); i++) {
            wynik = wynik.suma(v1.get(i).iloczyn(v2.get(i)));
        }
        return wynik;
    }
}

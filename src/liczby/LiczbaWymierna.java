package liczby;

public class LiczbaWymierna extends Liczba {

    private int licznik;
    private int mianownik;

    public LiczbaWymierna(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public LiczbaWymierna(int licznik) {
        this(licznik, 1);
    }

    public LiczbaWymierna() {
        this(0);
    }

    @Override
    public LiczbaWymierna zero() {
        return new LiczbaWymierna(0);
    }

    @Override
    public LiczbaWymierna jeden() {
        return new LiczbaWymierna(1);
    }

    @Override
    public LiczbaWymierna suma(Liczba arg) {
        LiczbaWymierna a = (LiczbaWymierna) arg;
        return new LiczbaWymierna(licznik * a.mianownik + mianownik * a.licznik, mianownik * a.mianownik);
    }

    @Override
    public LiczbaWymierna iloczyn(Liczba arg) {
        LiczbaWymierna a = (LiczbaWymierna) arg;
        return new LiczbaWymierna(licznik * a.licznik, mianownik * a.mianownik);
    }

    @Override
    public String toString() {
        return licznik + "/" + mianownik;
    }
}

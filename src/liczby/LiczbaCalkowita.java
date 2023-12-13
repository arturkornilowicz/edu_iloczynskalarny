package liczby;

public class LiczbaCalkowita implements Liczba {

    private int wartosc;

    public LiczbaCalkowita(int wartosc) {
        this.wartosc = wartosc;
    }

    public LiczbaCalkowita() {
        this(0);
    }

    @Override
    public LiczbaCalkowita zero() {
        return new LiczbaCalkowita(0);
    }

    @Override
    public LiczbaCalkowita jeden() {
        return new LiczbaCalkowita(1);
    }

    @Override
    public LiczbaCalkowita suma(Liczba arg) {
        return new LiczbaCalkowita(wartosc + ((LiczbaCalkowita) arg).wartosc);
    }

    @Override
    public LiczbaCalkowita iloczyn(Liczba arg) {
        return new LiczbaCalkowita(wartosc * ((LiczbaCalkowita) arg).wartosc);
    }

    @Override
    public int porownaj(Liczba arg) {
        return wartosc - ((LiczbaCalkowita)arg).wartosc;
    }

    @Override
    public String toString() {
        return "" + wartosc;
    }
}

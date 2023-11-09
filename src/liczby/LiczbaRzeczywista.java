package liczby;

public class LiczbaRzeczywista implements Liczba {

    private double wartosc;

    public LiczbaRzeczywista(double wartosc) {
        this.wartosc = wartosc;
    }

    public LiczbaRzeczywista() {
        this(0.0);
    }

    @Override
    public LiczbaRzeczywista zero() {
        return new LiczbaRzeczywista(0.0);
    }

    @Override
    public LiczbaRzeczywista jeden() {
        return new LiczbaRzeczywista(1.0);
    }

    @Override
    public LiczbaRzeczywista suma(Liczba arg) {
        return new LiczbaRzeczywista(wartosc + ((LiczbaRzeczywista) arg).wartosc);
    }

    @Override
    public LiczbaRzeczywista iloczyn(Liczba arg) {
        return new LiczbaRzeczywista(wartosc * ((LiczbaRzeczywista) arg).wartosc);
    }

    @Override
    public String toString() {
        return "" + wartosc;
    }
}

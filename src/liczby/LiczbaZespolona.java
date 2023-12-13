package liczby;

public class LiczbaZespolona implements Liczba {

    private double re;
    private double im;

    public LiczbaZespolona(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public LiczbaZespolona(double re) {
        this(re, 0.0);
    }

    public LiczbaZespolona() {
        this(0.0);
    }

    @Override
    public LiczbaZespolona zero() {
        return new LiczbaZespolona(0);
    }

    @Override
    public LiczbaZespolona jeden() {
        return new LiczbaZespolona(1);
    }

    @Override
    public LiczbaZespolona suma(Liczba arg) {
        LiczbaZespolona a = (LiczbaZespolona) arg;
        return new LiczbaZespolona(re + a.re, im + a.im);
    }

    @Override
    public LiczbaZespolona iloczyn(Liczba arg) {
        LiczbaZespolona a = (LiczbaZespolona) arg;
        return new LiczbaZespolona(re * a.re - im * a.im, im * a.re + re * a.im);
    }

    double modul() {
        return Math.sqrt(re*re+im*im);
    }

    @Override
    public int porownaj(Liczba arg) {
        LiczbaZespolona a = (LiczbaZespolona) arg;
        if (modul() < a.modul())
            return -1;
        if (modul() > a.modul())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return re + "+" + im + "i";
    }
}

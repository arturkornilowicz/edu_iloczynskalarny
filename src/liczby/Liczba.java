package liczby;

public interface Liczba {
      Liczba zero();
      Liczba jeden();
      Liczba suma(Liczba arg);
      Liczba iloczyn(Liczba arg);
      int porownaj(Liczba arg);
}

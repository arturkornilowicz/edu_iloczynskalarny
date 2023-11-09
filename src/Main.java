import liczby.*;
import iloczyn.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LiczbaCalkowita> v1c = List.of(new LiczbaCalkowita(11),new LiczbaCalkowita(3));
        List<LiczbaCalkowita> v2c = List.of(new LiczbaCalkowita(2),new LiczbaCalkowita(-14));
        IloczynSkalarny iloczynSkalarnyC = new IloczynSkalarny<LiczbaCalkowita>(v1c,v2c,new LiczbaCalkowita().zero());
        System.out.println(iloczynSkalarnyC.iloczyn());

        List<LiczbaRzeczywista> v1r = List.of(new LiczbaRzeczywista(11),new LiczbaRzeczywista(3));
        List<LiczbaRzeczywista> v2r = List.of(new LiczbaRzeczywista(2),new LiczbaRzeczywista(-14));
        IloczynSkalarny iloczynSkalarnyR = new IloczynSkalarny<LiczbaRzeczywista>(v1r,v2r,new LiczbaRzeczywista().zero());
        System.out.println(iloczynSkalarnyR.iloczyn());

        List<LiczbaWymierna> v1w = List.of(new LiczbaWymierna(11),new LiczbaWymierna(3));
        List<LiczbaWymierna> v2w = List.of(new LiczbaWymierna(2),new LiczbaWymierna(-14));
        IloczynSkalarny iloczynSkalarnyW = new IloczynSkalarny<LiczbaWymierna>(v1w,v2w,new LiczbaWymierna().zero());
        System.out.println(iloczynSkalarnyW.iloczyn());

        List<LiczbaZespolona> v1z = List.of(new LiczbaZespolona(11),new LiczbaZespolona(3));
        List<LiczbaZespolona> v2z = List.of(new LiczbaZespolona(2),new LiczbaZespolona(-14));
        IloczynSkalarny iloczynSkalarnyZ = new IloczynSkalarny<LiczbaZespolona>(v1z,v2z,new LiczbaZespolona().zero());
        System.out.println(iloczynSkalarnyZ.iloczyn());
    }
}
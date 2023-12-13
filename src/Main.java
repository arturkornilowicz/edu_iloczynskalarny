import liczby.*;
import iloczyn.*;
import wektory.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LiczbaCalkowita> v1c = List.of(new LiczbaCalkowita(11),new LiczbaCalkowita(20),new LiczbaCalkowita(3));
        List<LiczbaCalkowita> v2c = List.of(new LiczbaCalkowita(2),new LiczbaCalkowita(0),new LiczbaCalkowita(-14));
        IloczynSkalarny<LiczbaCalkowita> iloczynSkalarnyC = new IloczynSkalarny<>(v1c,v2c,new LiczbaCalkowita().zero());
        System.out.println(iloczynSkalarnyC.iloczyn());

        List<LiczbaRzeczywista> v1r = List.of(new LiczbaRzeczywista(11),new LiczbaRzeczywista(20),new LiczbaRzeczywista(3));
        List<LiczbaRzeczywista> v2r = List.of(new LiczbaRzeczywista(2),new LiczbaRzeczywista(0),new LiczbaRzeczywista(-14));
        IloczynSkalarny<LiczbaRzeczywista> iloczynSkalarnyR = new IloczynSkalarny<>(v1r,v2r,new LiczbaRzeczywista().zero());
        System.out.println(iloczynSkalarnyR.iloczyn());

        List<LiczbaWymierna> v1w = List.of(new LiczbaWymierna(11),new LiczbaWymierna(20),new LiczbaWymierna(3));
        List<LiczbaWymierna> v2w = List.of(new LiczbaWymierna(2),new LiczbaWymierna(0),new LiczbaWymierna(-14));
        IloczynSkalarny<LiczbaWymierna> iloczynSkalarnyW = new IloczynSkalarny<>(v1w,v2w,new LiczbaWymierna().zero());
        System.out.println(iloczynSkalarnyW.iloczyn());

        List<LiczbaZespolona> v1z = List.of(new LiczbaZespolona(11),new LiczbaZespolona(20),new LiczbaZespolona(3));
        List<LiczbaZespolona> v2z = List.of(new LiczbaZespolona(2),new LiczbaZespolona(),new LiczbaZespolona(-14));
        IloczynSkalarny<LiczbaZespolona> iloczynSkalarnyZ = new IloczynSkalarny<>(v1z,v2z,new LiczbaZespolona().zero());
        System.out.println(iloczynSkalarnyZ.iloczyn());

        System.out.println("\n\n Wektory\n");

        Wektor<LiczbaCalkowita> wektorC = new Wektor<>(v1c);
        System.out.println(wektorC);
        System.out.println(wektorC.min());
        System.out.println(wektorC.max());


        Wektor<LiczbaRzeczywista> wektorR = new Wektor<>(v1r);
        System.out.println(wektorR);
        System.out.println(wektorR.min());
        System.out.println(wektorR.max());


        Wektor<LiczbaWymierna> wektorW = new Wektor<>(v1w);
        System.out.println(wektorW);
        System.out.println(wektorW.min());
        System.out.println(wektorW.max());

        Wektor<LiczbaZespolona> wektorZ = new Wektor<>(v1z);
        System.out.println(wektorZ);
        System.out.println(wektorZ.min());
        System.out.println(wektorZ.max());
    }
}
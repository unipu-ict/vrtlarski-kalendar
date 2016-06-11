package hr.unipu.hortus;


import java.util.ArrayList;
import java.util.List;

public class Podaci {
    private static List<Biljka> podaci = new ArrayList<>();

    public static List<Biljka> dajPodatke() {
        return podaci;
    }

    static {
        // naziv, opis, otvoreno?, mjesec-sadnje, mjesec-berbe
        podaci.add(new Biljka("Paprika","Bla bla",false,2,9));
        podaci.add(new Biljka("Rajčica","Bla bla",false,2,9));
        podaci.add(new Biljka("Krastavac","Bla bla",true,4,9));
    }

}
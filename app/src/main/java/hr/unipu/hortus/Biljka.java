package hr.unipu.hortus;


public class Biljka {
    String ime;
    String opis;
    boolean otvoreno;
    int mjesec_sadnje;
    int mjesec_berbe;

    public Biljka() {
    }

    public Biljka(String ime, String opis, boolean otvoreno, int mjesec_sadnje, int mjesec_berbe) {
        this.ime = ime;
        this.opis = opis;
        this.otvoreno = otvoreno;
        this.mjesec_sadnje = mjesec_sadnje;
        this.mjesec_berbe = mjesec_berbe;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getMjesec_sadnje() {
        return mjesec_sadnje;
    }

    public void setMjesec_sadnje(int mjesec_sadnje) {
        this.mjesec_sadnje = mjesec_sadnje;
    }

    public int getMjesec_berbe() {
        return mjesec_berbe;
    }

    public void setMjesec_berbe(int mjesec_berbe) {
        this.mjesec_berbe = mjesec_berbe;
    }

    public boolean isOtvoreno() {
        return otvoreno;
    }

    public void setOtvoreno(boolean otvoreno) {
        this.otvoreno = otvoreno;
    }

    @Override
    public String toString() {
        return ime;
    }
}
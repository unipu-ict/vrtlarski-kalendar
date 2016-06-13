package hr.unipu.hortus;


public class Biljka {
    String ime;
    String opis;
    int[] mjeseci_sadnje;
    int[] mjeseci_berbe;
    String slika;

    public Biljka() {
    }

    public Biljka(String ime, String opis, int[] mjeseci_sadnje, int[] mjeseci_berbe, String slika) {
        this.ime = ime;
        this.opis = opis;
        this.mjeseci_sadnje = mjeseci_sadnje;
        this.mjeseci_berbe = mjeseci_berbe;
        this.slika = slika;
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

    public String getMjeseci_sadnje() {
        StringBuilder builder = new StringBuilder();
        for (int mjesec:  mjeseci_sadnje) {
            builder.append(mjesec);
            builder.append(" ");
        }

        return builder.toString();
    }

    public void setMjeseci_sadnje(int[] mjeseci_sadnje) {
        this.mjeseci_sadnje = mjeseci_sadnje;
    }

    public String getMjeseci_berbe() {
        StringBuilder builder = new StringBuilder();
        for (int mjesec:  mjeseci_berbe) {
            builder.append(mjesec);
            builder.append(" ");
        }

        return builder.toString();
    }

    public void setMjeseci_berbe(int[] mjeseci_berbe) {
        this.mjeseci_berbe = mjeseci_berbe;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    @Override
    public String toString() {
        return ime;
    }
}
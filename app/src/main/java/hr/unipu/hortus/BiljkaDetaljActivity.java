package hr.unipu.hortus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class BiljkaDetaljActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biljka_detalj);

        List<Biljka> popis_biljaka = Podaci.dajPodatke();
        int broj_biljke = getIntent().getIntExtra("broj_biljke", 0);
        Biljka odabrana_biljka = popis_biljaka.get(broj_biljke);

        TextView ime_tekst = (TextView) findViewById(R.id.ime_biljke);
        ime_tekst.setText(odabrana_biljka.getIme());

        TextView opis_tekst = (TextView) findViewById(R.id.opis_biljke);
        opis_tekst.setText(odabrana_biljka.getOpis());

        TextView sjetva_tekst = (TextView) findViewById(R.id.mjesec_sjetve);
        sjetva_tekst.append(String.valueOf(odabrana_biljka.getMjesec_sadnje()));

        TextView berba_tekst = (TextView) findViewById(R.id.mjesec_berbe);
        berba_tekst.append(String.valueOf(odabrana_biljka.getMjesec_berbe()));
    }
}
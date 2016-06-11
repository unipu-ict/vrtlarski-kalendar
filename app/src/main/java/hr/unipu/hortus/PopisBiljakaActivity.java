package hr.unipu.hortus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class PopisBiljakaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popis_biljaka);

        /*izvor: http://www.cipro.hr/kalendar-radova-vrt.htm#.V1vTsRyKS70 */
        List<Biljka> popis_biljaka = new ArrayList<>();
        // naziv, opis, otvoreno?, mjesec-sadnje, mjesec-berbe
        popis_biljaka.add(new Biljka("Paprika", "Bla bla", false, 2, 9));
        popis_biljaka.add(new Biljka("Rajčica", "Bla bla", false, 2, 9));
        popis_biljaka.add(new Biljka("Krastavac", "Bla bla", true, 4, 9));

        ArrayAdapter<Biljka> biljkaArrayAdapter = new ArrayAdapter<Biljka>(this, android.R.layout.simple_list_item_1, popis_biljaka);
        ListView listView = (ListView) findViewById(R.id.biljke_listView);
        listView.setAdapter(biljkaArrayAdapter);
    }
}
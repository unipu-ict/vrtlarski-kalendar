package hr.unipu.hortus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        List<Biljka> popis_biljaka= Podaci.dajPodatke();


//        ArrayAdapter<Biljka> biljkaArrayAdapter = new ArrayAdapter<Biljka>(this, android.R.layout.simple_list_item_1, popis_biljaka);
        ListView listView = (ListView) findViewById(R.id.biljke_listView);
        listView.setAdapter(new BiljkaAdapter(this,0,popis_biljaka));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(PopisBiljakaActivity.this, BiljkaDetaljActivity.class);
                i.putExtra("broj_biljke", position);
                startActivity(i);
            }
        });
    }
}
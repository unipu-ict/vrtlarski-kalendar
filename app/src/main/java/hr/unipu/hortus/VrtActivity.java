package hr.unipu.hortus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class VrtActivity extends AppCompatActivity {

    List<Biljka> biljke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrt);
        setTitle("Moj vrt");

        biljke = Podaci.dajVrt(this);
        ListView listaVrt = (ListView) findViewById(R.id.listaVrt);
        listaVrt.setAdapter(new BiljkaVrtAdapter(this,0,biljke));
    }
}
package hr.unipu.hortus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class KalendarActivity extends AppCompatActivity {

    String[] mjeseci = new String[]{"Siječanj", "Veljača", "Ožujak", "Travanj", "Svibanj", "Lipanj", "Srpanj", "Kolovoz", "Rujan", "Listopad", "Studeni", "Prosinac"};

    TextView mjesecText;
    GridView gridSijeSe;
    GridView gridBereSe;

    List<Biljka> biljkeKojeSeSiju;
    List<Biljka> biljkeKojeSeBeru;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendar);
        setTitle("Kalendar");

        Spinner spinner = (Spinner) findViewById(R.id.spinnerMjeseci);
        mjesecText = (TextView) findViewById(R.id.imeMjeseca);
        gridSijeSe = (GridView) findViewById(R.id.gridSijeSe);
        gridBereSe = (GridView) findViewById(R.id.gridBereSe);

        //za početak neka bude siječanj
        mjesecOdabran(1);
        //popuni dropdown mjesecima
        spinner.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, mjeseci));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                mjesecOdabran(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void mjesecOdabran(int mjesecId) {
        mjesecText.setText(mjeseci[mjesecId]);
        biljkeKojeSeSiju = Podaci.dajBiljkeKojeSeSiju(mjesecId);
        biljkeKojeSeBeru = Podaci.dajBiljkeKojeSeBeru(mjesecId);

        //popuni grid popise biljkama koje se siju i beru za odabrani mjesec
        gridSijeSe.setAdapter(new BiljkaAdapter(this,0,biljkeKojeSeSiju));
        gridBereSe.setAdapter(new BiljkaAdapter(this,0,biljkeKojeSeBeru));
    }
}
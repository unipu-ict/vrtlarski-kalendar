package hr.unipu.hortus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popis_biljaka(View view) {
        Intent i = new Intent(MainActivity.this, PopisBiljakaActivity.class);
        startActivity(i);
    }

    public void moj_vrt(View view) {
        Intent i = new Intent(MainActivity.this, VrtActivity.class);
        startActivity(i);
    }

    public void kalendar(View view) {
        Intent i = new Intent(MainActivity.this, KalendarActivity.class);
        startActivity(i);
    }
}
package hr.unipu.hortus;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

public class BiljkaVrtAdapter extends ArrayAdapter<Biljka> {
    Context context;
    List<Biljka> biljke;

    public BiljkaVrtAdapter(Context context, int resource, List<Biljka> objects) {
        super(context, resource, objects);

        this.context = context;
        this.biljke = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Biljka biljka = biljke.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        SharedPreferences sharedPref = context.getSharedPreferences("vrt", Context.MODE_PRIVATE);

        View view = inflater.inflate(R.layout.biljka_vrt_item, null);

        ImageView ikona = (ImageView) view.findViewById(R.id.slika_biljke_item);
        ikona.setImageResource(context.getResources().getIdentifier(biljka.getSlika(),"drawable", context.getPackageName()));

        TextView naziv = (TextView) view.findViewById(R.id.naziv_biljke_item);
        naziv.setText(biljka.getIme());

        //razlika između ciljnog i početnog dana u milisekundama dijeli se s brojem milisekundi u danu kako bi se dobio broj dana
        int preostaloDana = (int) ((sharedPref.getLong(biljka.getIme()+"_danBerbe",0) - Calendar.getInstance().getTimeInMillis())/86400000);
        int max = (int) ((sharedPref.getLong(biljka.getIme()+"_danBerbe",0) - sharedPref.getLong(biljka.getIme()+"_danSadnje",0))/86400000);

        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.preostaloKlijanje);
        progressBar.setProgress(max-preostaloDana);
        progressBar.setMax(max);
        if(preostaloDana>1) naziv.append(" (preostalo "+preostaloDana+" dana)");
        if(preostaloDana==1) naziv.append(" (preostao "+preostaloDana+" dan)");
        if(preostaloDana==0) {
            naziv.append(" (spremno u toku trenutnog dana)");
            progressBar.setIndeterminate(true);
            naziv.setTextColor(Color.BLUE);
        }
        if(preostaloDana<0) {
            naziv.append(" (spremno za branje!)");
            naziv.setTextColor(Color.GREEN);
        }



        return view;
    }
}
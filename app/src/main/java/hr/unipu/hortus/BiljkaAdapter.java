package hr.unipu.hortus;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BiljkaAdapter extends ArrayAdapter<Biljka> {
    Context context;
    List<Biljka> biljke;

    public BiljkaAdapter(Context context, int resource, List<Biljka> objects) {
        super(context, resource, objects);

        this.context = context;
        this.biljke = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Biljka biljka = biljke.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.biljka_item, null);

        ImageView ikona = (ImageView) view.findViewById(R.id.slika_biljke_item);
        ikona.setImageResource(context.getResources().getIdentifier(biljka.getSlika(),"drawable", context.getPackageName()));

        TextView naziv = (TextView) view.findViewById(R.id.naziv_biljke_item);
        naziv.setText(biljka.getIme());

        return view;
    }
}
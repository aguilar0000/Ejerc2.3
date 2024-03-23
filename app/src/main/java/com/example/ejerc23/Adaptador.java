package com.example.ejerc23;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.ejerc23.transacciones.Photograh;
public class Adaptador  extends ArrayAdapter<Fotografia> {
    ArrayList<Fotografia> listaFotos = new ArrayList<>();

    public Adaptador(Context context, int textViewResourceId, ArrayList<Fotografia> objects) {
        super(context, textViewResourceId, objects);
        listaFotos = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.grid_view_items, null);
        ImageView imageView = (ImageView) v.findViewById(R.id.img);
        imageView.setImageBitmap(listaFotos.get(position).getImagen());
        TextView textView = (TextView) v.findViewById(R.id.txtdescripcionList);
        textView.setText(listaFotos.get(position).getDescripcion());
        return v;
    }
}

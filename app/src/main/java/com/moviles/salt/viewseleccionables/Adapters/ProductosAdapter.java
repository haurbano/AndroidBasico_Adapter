package com.moviles.salt.viewseleccionables.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.moviles.salt.viewseleccionables.R;
import com.moviles.salt.viewseleccionables.models.Productos;

import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by Diana M on 23/09/2015.
 */
public class ProductosAdapter extends BaseAdapter{

    List<Productos> data;
    Context context;

    public ProductosAdapter(List<Productos> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v;
        if (convertView == null)
            v = View.inflate(context, R.layout.template_adapter,null);
        else
            v = convertView;
        TextView titulo, precio;
        titulo = (TextView) v.findViewById(R.id.txt_titulo);
        precio = (TextView) v.findViewById(R.id.txt_precio);

        titulo.setText(data.get(position).getTitulo());
        precio.setText(data.get(position).getPrecio());

        return v;
    }
}

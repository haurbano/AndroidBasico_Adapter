package com.moviles.salt.viewseleccionables;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    ListView listaProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaProductos = (ListView) findViewById(R.id.list_items);
        listaProductos.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position)
        {
            case 0:
                Intent intentPc = new Intent(this,ComputadorActivity.class);
                startActivity(intentPc);
                break;
            case 1:
                Intent intentCel = new Intent(this,CelularActivity.class);
                startActivity(intentCel);
                break;
            case 2:
                Toast.makeText(this,"Seleccino Mause",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(this,"Seleccino Teclado",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(this,"Seleccino Monitor",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}

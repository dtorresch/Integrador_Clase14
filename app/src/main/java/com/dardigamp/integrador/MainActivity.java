package com.dardigamp.integrador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    public static AlmacenPuntuaciones almacen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        almacen = new AlmacenPuntuacionesPreferencias(this);
        almacen.guardarPuntuacion(5000, "Daniel", 06072023);

    }
    public void lanzarConf(View view){
        Vector<String> rs = new Vector<String>();
        rs = almacen.listaPuntuaciones(1);

        for(int i=0;i<rs.size();i++)
        {
            Toast.makeText(this, rs.get(i), Toast.LENGTH_SHORT).show();
        }
    }

}
package com.example.cartshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PruebaDatos extends AppCompatActivity {
    String Total;
    List<String> historyArray2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba_datos);
        TextView txt1 = findViewById(R.id.texto);

        Bundle bundle = this.getIntent().getExtras();
       Total =bundle.getString("Total");
        for ( int i=0; i < historyArray2.size(); i++) {
            historyArray2.add(Total);
        }
        txt1.setText("Nombre Completo Empleado: " + historyArray2);

        System.out.println("PruebaDatos"+historyArray2);
    }
}
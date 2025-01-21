package com.example.ejercicio1_unidad9miguelangelruizaguilar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MiBroadcast miBroadcast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Iniciar y registrar el BroadcastReceiver para detectar la conexión del cargador
        miBroadcast = new MiBroadcast();
        IntentFilter filter = new IntentFilter(Intent.ACTION_POWER_CONNECTED); // Filtro para detectar carga conectada
        registerReceiver(miBroadcast, filter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Desregistrar el BroadcastReceiver cuando la actividad se destruya
        if (miBroadcast != null) {
            unregisterReceiver(miBroadcast);
        }
    }
}

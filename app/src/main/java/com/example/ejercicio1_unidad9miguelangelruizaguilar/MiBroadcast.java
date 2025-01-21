package com.example.ejercicio1_unidad9miguelangelruizaguilar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MiBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // Cuando se detecte que el cargador ha sido conectado
        if (Intent.ACTION_POWER_CONNECTED.equals(intent.getAction())) {
            // Mostrar un mensaje Toast
            Toast.makeText(context, "¡Cargador Conectado!", Toast.LENGTH_LONG).show();
        }
    }
}

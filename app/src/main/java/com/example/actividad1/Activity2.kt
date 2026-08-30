package com.example.actividad1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2) // Aquí es donde se conecta la activity con el XML

        // Así se asignan los botones a variables
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        val btnRechazar = findViewById<Button>(R.id.btnRechazar)

        // Esto dictamina qué hace el botón aceptar cuando le damos click, usando un listener
        btnAceptar.setOnClickListener {
            val intentRespuesta = Intent()
            intentRespuesta.putExtra("SELECCION", "Aceptado") // Aquí se guarda el dato
            setResult(RESULT_OK, intentRespuesta) // Aquí se envía el dato y se dice que el proceso salió bien
            finish() //Se ciera la pantalla y vuelve a la principal
        }

        btnRechazar.setOnClickListener {
            val intentRespuesta = Intent()
            intentRespuesta.putExtra("SELECCION", "Rechazado")
            setResult(RESULT_OK, intentRespuesta)
            finish()
        }
    }
}
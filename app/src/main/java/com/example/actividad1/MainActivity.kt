package com.example.actividad1

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Esto es un lanzador que abre la segunda pantalla y escuchará la respuesta
    private val lanzadorSegundaPantalla = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {result ->

        // Este pedazo solo se ejecuta cuando volvemos de la pantalla de la activity2
        if (result.resultCode == Activity.RESULT_OK){

            // Extraemos el texto que se guardó en la llave SELECCION
            val seleccion = result.data?.getStringExtra("SELECCION")

            //Buscar el TextView donde se muestra la elección de la pantalla 2 y se actualiza el texto
            val tvResultado = findViewById<TextView>(R.id.tvResultado)
            tvResultado.text = "El usuario seleccionó: $seleccion"
        }
    }



}
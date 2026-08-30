package com.example.actividad1

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DosActivity: AppCompatActivity() { //
    override fun onCreate(savedInstanceState: Bundle?) { //Aqui con el override sirve ya que toda Activity tiene un onCreate por defecto y lo que se hace es sobreescribirlo para poner la logica que necesite en especifico
        super.onCreate(savedInstanceState) //CODIGO OBLIGATORIO - Sirve para llamar con el super a la clase padre AppCompactActivity para que cargue primero la logica de inicializacion que se encuentra ahi

        setContentView(R.layout.activity_2) //ESTA ES LA LINEA MAS IMPORTANTE - Es la que le dice a la Activity que XML mostrar en pantalla ()

        val mainTextView = findViewById<TextView>(R.id.mainMessage) //Aqui creo la variable en la que almaceno el TextView principal
        val textReceived = intent.getStringExtra("UserText")?: "N/A" //Aqui obtengo y almaceno el texto que se envio desde la mainActivity con el "intent.putExtra("UserText", userText)"

        mainTextView.text = "Texto recibido: " + textReceived //El valor text de la etiqueta TextView lo modifico con el .text y colocandole el valor que quiero que se vea

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.activity_2)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
}
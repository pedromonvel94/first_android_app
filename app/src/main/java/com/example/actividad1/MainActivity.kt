package com.example.actividad1

import android.content.Intent
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val lanzadorSegundaPantalla = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {result ->

        // Este pedazo solo se ejecuta cuando volvemos de la pantalla de la activity2
        if (result.resultCode == Activity.RESULT_OK){

            // Extraemos el texto que se guardó en la llave SELECCION
            val selection = result.data?.getStringExtra("SelectedOption")

            //Buscar el TextView donde se muestra la elección de la pantalla 2 y se actualiza el texto
            val mainTextViewActivity1 = findViewById<TextView>(R.id.mainTextViewActivity1)
            if (selection?.lowercase().equals("correct")) {
                mainTextViewActivity1.setTextColor(ContextCompat.getColor(this, R.color.green_500))
            }else{
                mainTextViewActivity1.setTextColor(ContextCompat.getColor(this, R.color.red))
            }

            mainTextViewActivity1.text = "El usuario seleccionó: $selection"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //Aqui creo la variable con el button para poder interactuar con el
        val submitButton = findViewById<Button>(R.id.buttonSubmit)
        val textField = findViewById<EditText>(R.id.textInput1) //Obtengo el textField en el que el usuario escribira

        submitButton.setOnClickListener {
            val userText = textField.text.toString() //Aqui si obtengo el texto que escribe el usuario
            if (userText.isNotBlank()){ //Si no esta vacio
                val intent = Intent(this, DosActivity::class.java)

                intent.putExtra("UserText", userText)

                lanzadorSegundaPantalla.launch(intent)
            }
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }

}
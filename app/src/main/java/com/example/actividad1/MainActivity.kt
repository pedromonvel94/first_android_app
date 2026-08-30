package com.example.actividad1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
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

                startActivity(intent)
                //registerForActivityResult<>()
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
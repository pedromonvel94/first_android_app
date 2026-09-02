package com.example.actividad1

import android.content.Intent
import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageView
import android.view.View
import com.google.android.material.card.MaterialCardView
import android.graphics.Color
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

            // Referencias a los nuevos elementos de la tarjeta de resultado
            val resultCard = findViewById<MaterialCardView>(R.id.resultCard)
            val resultIcon = findViewById<ImageView>(R.id.resultIcon)
            val resultText = findViewById<TextView>(R.id.resultText)

            resultCard.visibility = View.VISIBLE

            if (selection?.lowercase() == "correct") {
                resultCard.setCardBackgroundColor(ContextCompat.getColor(this, R.color.green_200))
                resultIcon.setImageResource(R.drawable.ic_check)
                resultIcon.setColorFilter(ContextCompat.getColor(this, R.color.green_700))
                resultText.setTextColor(ContextCompat.getColor(this, R.color.green_700))
                resultText.text = "Confirmación: ¡El texto es correcto!"
            } else {
                resultCard.setCardBackgroundColor(ContextCompat.getColor(this, R.color.red))
                resultIcon.setImageResource(R.drawable.ic_close)
                resultIcon.setColorFilter(Color.WHITE)
                resultText.setTextColor(Color.WHITE)
                resultText.text = "Confirmación: El texto es incorrecto"
            }
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
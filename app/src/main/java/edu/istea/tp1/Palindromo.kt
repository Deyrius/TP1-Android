package edu.istea.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_palindromo.*
import android.widget.*


class Palindromo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_palindromo)

        val texto = findViewById<EditText>(R.id.p_e_text)
        val probar = findViewById<Button>(R.id.p_btn)

        probar.setOnClickListener(){
            var reverso = texto.getText().toString().reversed()


            if (texto.getText().toString() == reverso){Toast.makeText(this@Palindromo,"Es un Palindromo",Toast.LENGTH_SHORT).show()}
            else{Toast.makeText(this,"No es un Palindromo",Toast.LENGTH_SHORT).show()}


        }
    }
}
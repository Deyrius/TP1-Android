package edu.istea.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import android.util.Log
import kotlin.math.log


class Temperatura : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperatura);
        val texto = findViewById<EditText>(R.id.e_t_celsius)
        val boton = findViewById<Button>(R.id.t_btn_submit)


        boton.setOnClickListener(){
            val cuenta = (texto.getText().toString().toDouble()* 9/5 + 32).toString()
            Toast.makeText(this,cuenta +"°F",Toast.LENGTH_SHORT).show()


        }

    }

}
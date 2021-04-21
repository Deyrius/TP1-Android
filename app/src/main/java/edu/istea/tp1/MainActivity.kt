package edu.istea.tp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton1 = findViewById<Button>(R.id.btnPal)
        boton1.setOnClickListener {
            val intento1 = Intent(this, Palindromo::class.java)
            startActivity(intento1)
        }
        val boton2 = findViewById<Button>(R.id.btnTemp)
        boton2.setOnClickListener {
            val intento2 = Intent(this, Temperatura::class.java)
            startActivity(intento2)
        }
    }
}

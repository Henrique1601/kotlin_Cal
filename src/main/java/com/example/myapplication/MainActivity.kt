package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtValor1 = findViewById<EditText>(R.id.edit_valor1)
        val edtValor2 = findViewById<EditText>(R.id.edit_valor2)
        val btn = findViewById<Button>(R.id.button)
        val btn2 = findViewById<Button>(R.id.button2)
        val btn3 = findViewById<Button>(R.id.button3)
        val btn4 = findViewById<Button>(R.id.button4)

        btn.setOnClickListener {
            val valor1 = edtValor1.text.toString().toInt()
            val valor2 = edtValor2.text.toString().toInt()
            val soma = valor1 + valor2
            Toast.makeText( this,  "O valor da soma é ${soma}",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            val valor1 = edtValor1.text.toString().toInt()
            val valor2 = edtValor2.text.toString().toInt()
            val multi = valor1 * valor2
            Toast.makeText( this,"O valor multiplicado é ${multi}", Toast.LENGTH_SHORT).show()
        }
        btn3.setOnClickListener{
            val valor1 = edtValor1.text.toString().toInt()
            val valor2 = edtValor2.text.toString().toInt()
            val div = valor1 / valor2
            Toast.makeText( this,"O valor dividido é ${div}", Toast.LENGTH_SHORT).show()
        }
        btn4.setOnClickListener {
            val valor1 = edtValor1.text.toString().toInt()
            val valor2 = edtValor2.text.toString().toInt()
            val sub = valor1 - valor2
            Toast.makeText( this,"O valor subtraido é ${sub}", Toast.LENGTH_SHORT).show()
        }

    }
}
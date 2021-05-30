package com.example.semana_16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Resta= findViewById<Button>(R.id.btnRestar)
        val Suma= findViewById<Button>(R.id.btnSuma)
        val Contador= findViewById<TextView>(R.id.txtContador)
        Contador.text = "0"

        Suma.setOnClickListener( object: View.OnClickListener{
            override fun onClick(v: View?) {
              Sumar()
                Contador.text = total.toString()
            }
        })
        Resta.setOnClickListener( object: View.OnClickListener{
            override fun onClick(v: View?) {
               Restar()
                Contador.text = total.toString()
            }
        })
    }
    private var total: Int=0

    private fun Sumar (){
        total++
    }
    private fun Restar(){
        total--
    }
}
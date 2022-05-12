package com.example.recuperacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.findNavController
import com.example.recuperacion.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        var spinner1: Spinner = findViewById<Spinner>(R.id.spinner)

        val lista = listOf("Castle in the Sky","Grave of the Fireflies","My Neighbor Totoro")

        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista)

        spinner1.adapter = adaptador
    }

}
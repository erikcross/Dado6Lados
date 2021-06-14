package com.dadoseislados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
    }

    fun rodarDado(view: View){

        var texto = findViewById<TextView>(R.id.textoDado)
        var imagem = findViewById<ImageView>(R.id.dado)
        var numeroDado = Random().nextInt(7)
        if(numeroDado == 1){imagem.setImageResource(R.drawable.ladoum)}
        else{if(numeroDado == 2){imagem.setImageResource(R.drawable.ladodois)}
        else{if(numeroDado == 3){imagem.setImageResource(R.drawable.ladotres)}
        else{if(numeroDado == 4){imagem.setImageResource(R.drawable.ladoquatro)}
        else{if(numeroDado == 5){imagem.setImageResource(R.drawable.ladocinco)}
        else{if(numeroDado == 6){imagem.setImageResource(R.drawable.ladoseis)}
        else{imagem.setImageResource(R.drawable.ladozero)}/*else6*/}/*else5*/}/*else4*/}/*else3*/}/*else2*/}

        if(numeroDado == 0){texto.text = "O dado caiu...rode novamente!"}else{texto.text = "Dado Rodado!"}

    }

}
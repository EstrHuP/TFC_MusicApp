package com.example.musicapp.view

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.musicapp.R
import com.example.musicapp.model.Festivales
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_festival_detail.*
import kotlinx.android.synthetic.main.rowfestival.view.*

class FestivalDetailActivity : AppCompatActivity() {

    private lateinit var context: Context
    private lateinit var festival:Festivales

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_festival_detail)

        festival = intent.getSerializableExtra("festival") as Festivales

        showFestivalPulsado()
    }

    private fun showFestivalPulsado(){
        tvNombreDetailFest.text = festival.nombre
        Picasso.with(this).load(festival.cartel).into(ivCartelDetailFest)
        tvFechaDetailFest.text = "${festival.fecha_inicio} al ${festival.fecha_final} de 2019"
        tvPrecioDetailFest.text = "desde ${festival.precio}0€"
        tvUbiDetailFest.text = festival.ubicacion
        tvGeneroDetailFest.text = festival.genero
    }


}

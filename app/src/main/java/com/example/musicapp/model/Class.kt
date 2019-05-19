package com.example.musicapp.model

import java.io.Serializable

data class Usuarios(
    var nombre: String = "",
    var email: String = "",
    var password: String = "",
    var avatar: String = ""
): Serializable

data class Festivales(
    var cartel: String = "",
    var ubicacion:String = "",
    var icono: String = "",
    var fecha_inicio: String = "",
    var fecha_final: String = "",
    var genero: String = "",
    var nombre: String ="",
    var precio: Float= 0F,
    var puntuacion_media: Int = 0,
    var url_original: String ="",
    var fotos: List<String> = listOf(""),
    var comentarios: String="",
    var latitud: String="",
    var longitud: String=""
): Serializable

data class Conciertos(
    var fecha: String = "",
    var genero: String = "",
    var nombre: String = "",
    var precio: Float = 0F,
    var url_original: String = "",
    var horario: String = "",
    var latitud: String = "",
    var longitud: String = ""
): Serializable


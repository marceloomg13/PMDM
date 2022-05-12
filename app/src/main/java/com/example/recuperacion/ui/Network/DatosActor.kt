package com.example.recuperacion.ui.Network

import com.squareup.moshi.Json

data class DatosActores(
    @Json(name = "id") val id: String,
    @Json(name = "name") val nombre: String,
    @Json(name = "gender") val genero: String,
    @Json(name = "age") val edad: String,
    @Json(name = "eye_color") val ojos: String,
    @Json(name = "hair_color") val pelo: String
)
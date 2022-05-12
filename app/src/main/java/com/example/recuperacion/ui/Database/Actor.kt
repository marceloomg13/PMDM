package com.example.recuperacion.ui.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "Actores")
data class Actor(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,

    @ColumnInfo(name = "name")
    var name: String = "",

    @ColumnInfo(name = "date")
    var date: Date? = null,

    @ColumnInfo(name = "place")
    val place: String = ""
)

package com.example.recuperacion.ui.Database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ActorDatabaseDao {

    @Insert
    suspend fun insert(actor: Actor)

    @Update
    suspend fun update(actor: Actor)

    @Query("DELETE FROM Actores")
    suspend fun clear()

    @Query("SELECT * from Actores WHERE id = :key")
    suspend fun get(key: Long): Actor?

    @Query("SELECT * FROM Actores ORDER BY id DESC")
    fun getTodosLasActores(): LiveData<List<Actor>>

    @Query("SELECT * FROM Actores ORDER BY id DESC LIMIT 1")
    suspend fun getUltimoActor(): Actor?

}


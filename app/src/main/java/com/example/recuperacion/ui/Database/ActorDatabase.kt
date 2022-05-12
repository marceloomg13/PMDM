package com.example.recuperacion.ui.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Actor::class], version = 1, exportSchema = false)
abstract class ActorDatabase : RoomDatabase() {


    abstract val actorDatabaseDao: ActorDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: ActorDatabase? = null

        fun getInstance(context: Context): ActorDatabase {
            // Multiple threads can ask for the database at the same time, ensure we only initialize
            // it once by using synchronized. Only one thread may enter a synchronized block at a time.
            synchronized(this) {
                // Copy the current value of INSTANCE to a local variable so Kotlin can smart cast.
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ActorDatabase::class.java,
                        "Actores_history"
                    )
                        // Wipes and rebuilds instead of migrating if no Migration object.
                        .createFromAsset("")
                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }

                return instance  // smart cast to be non-null.
            }
        }
    }
}

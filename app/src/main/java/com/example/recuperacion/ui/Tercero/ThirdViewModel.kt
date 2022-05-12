package com.example.recuperacion.ui.Tercero

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class ThirdViewModel:ViewModel() {
    private val _id = MutableLiveData<LongArray>()
    val id: LiveData<LongArray>
        get() = _id

    private val _name = MutableLiveData<String>()
    val name: LiveData<String>
        get() = _name

    private val _date = MutableLiveData<Date>()
    val date: LiveData<Date>
        get() = _date

    private val _location = MutableLiveData<String>()
    val location: LiveData<String>
        get() = _location

}
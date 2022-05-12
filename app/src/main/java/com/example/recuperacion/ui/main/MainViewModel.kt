package com.example.recuperacion.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope;



class MainViewModel : ViewModel() {



    private val _text = MutableLiveData<String>()
    val text: LiveData<String>
        get() = _text
    init {
        _text.value = "hola"
    }
    fun touch() {
        _text.value = "pulsado"
    }
}
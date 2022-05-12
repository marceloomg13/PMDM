package com.example.recuperacion.ui.Segundo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondViewModel:ViewModel() {
    private val _id = MutableLiveData<Long>()
    val id: LiveData<Long>
        get() = _id

    private val _name = MutableLiveData<Long>()
    val name: LiveData<Long>
        get() = _name

    private val _genre = MutableLiveData<Long>()
    val genre: LiveData<Long>
        get() = _genre

    private val _age = MutableLiveData<Long>()
    val age: LiveData<Long>
        get() = _age

    private val _eye_color = MutableLiveData<Long>()
    val eye_color: LiveData<Long>
        get() = _eye_color

    private val _hair_color = MutableLiveData<Long>()
    val hair_color: LiveData<Long>
        get() = _hair_color
}
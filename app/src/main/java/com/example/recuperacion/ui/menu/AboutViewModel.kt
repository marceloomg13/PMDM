package com.example.recuperacion.ui.menu

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private var _texto = MutableLiveData<String>()
    val texto: LiveData<String>
        get() = _texto

    init {
        _texto.value="Aplicación Casting con Acceso a base de datos, conexión a internet, viewModels y Navegación entre fragmentos"
    }
}
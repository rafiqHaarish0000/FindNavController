package com.example.plant_g.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ModelView():ViewModel() {
    val clickEvent = MutableLiveData<Boolean>()

    fun onCLickEvent() {
        clickEvent.postValue(true)
    }

}
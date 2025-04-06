package com.example.lifecycleawarecomponents.LiveDataConcept

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelForLiveData: ViewModel() {

    private val factLiveData = MutableLiveData<String>("This is the default fact")

    // store mutable live data in LiveData which will never change
    val liveDataFact : LiveData<String>
        get() = factLiveData


    fun updateLiveData(){
        factLiveData.value = "Updated Fact"
    }
}
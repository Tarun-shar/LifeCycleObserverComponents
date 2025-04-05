package com.example.lifecycleawarecomponents.ViewModelFactory

import androidx.lifecycle.ViewModel

class ViewModelForFactory(val number:Int): ViewModel() {

    var count:Int = number

    fun increment(){
        count++
    }
}
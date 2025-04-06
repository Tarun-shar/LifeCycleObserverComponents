package com.example.lifecycleawarecomponents.ViewModelFactoryConcept

import androidx.lifecycle.ViewModel

class ViewModelForFactory(val number:Int): ViewModel() {

    var count:Int = number

    fun increment(){
        count++
    }
}
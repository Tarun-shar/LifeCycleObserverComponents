package com.example.lifecycleawarecomponents.ViewModelFactoryConcept

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class MainViewModelFactory(val counter:Int): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ViewModelForFactory(counter) as T
    }
}
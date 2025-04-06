package com.example.lifecycleawarecomponents.SimpleDataBindingConcept

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.lifecycleawarecomponents.ModelClass
import com.example.lifecycleawarecomponents.R
import com.example.lifecycleawarecomponents.databinding.ActivityMain5Binding


class MainActivity5 : AppCompatActivity() {

    lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main5)

        // Creating an instance of DataModel
        val obj: ModelClass? = ModelClass("Tarun Kaushik", "Android App Developer")
        binding.dataModelVariable = obj  // Binding the data to XML

    }
}
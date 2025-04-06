package com.example.lifecycleawarecomponents.ViewModelFactoryConcept

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycleawarecomponents.LiveDataConcept.MainActivity4
import com.example.lifecycleawarecomponents.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var viewModelForFactory: ViewModelForFactory

    lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModelForFactory = ViewModelProvider(this, MainViewModelFactory(10))[ViewModelForFactory::class.java]

        setText()

    }

    fun setText(){
        binding.numberText.text = viewModelForFactory.count.toString()
    }

    fun Increment(view: View) {
        viewModelForFactory.increment()
        setText()
    }

    fun goActivity4(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }
}
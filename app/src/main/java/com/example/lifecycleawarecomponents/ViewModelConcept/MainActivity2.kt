package com.example.lifecycleawarecomponents.ViewModelConcept

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycleawarecomponents.R
import com.example.lifecycleawarecomponents.ViewModelFactory.MainActivity3
import com.example.lifecycleawarecomponents.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        setText()
    }

    fun setText(){
        binding.numberText.text = viewModel.count.toString()
    }
    fun Increment(view: View) {
        viewModel.increment()
        setText()
    }

    fun Navigate(view: View) {
        val intent = Intent(this , MainActivity3::class.java)
        startActivity(intent)
    }
}
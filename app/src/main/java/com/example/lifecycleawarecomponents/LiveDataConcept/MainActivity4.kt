package com.example.lifecycleawarecomponents.LiveDataConcept

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lifecycleawarecomponents.R
import com.example.lifecycleawarecomponents.SimpleDataBindingConcept.MainActivity5
import com.example.lifecycleawarecomponents.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {

    lateinit var viewModel: ViewModelForLiveData
    lateinit var binding: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ViewModelForLiveData::class.java]

        viewModel.liveDataFact.observe(this, Observer {
            binding.tvName.text = it
        })

        binding.clickBtn.setOnClickListener {
            viewModel.updateLiveData()
        }
    }


    fun goActivity5(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }

}
package com.example.lifecycleawarecomponents

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(Observer())
        Log.d("checkLog", "onCreate: Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("checkLog", "onPause: Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("checkLog", "onResume: Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("checkLog", "onStop: Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("checkLog", "onDestroy: Activity")
    }

}
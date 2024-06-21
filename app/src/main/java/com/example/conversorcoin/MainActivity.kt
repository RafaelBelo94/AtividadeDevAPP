package com.example.conversorcoin

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.conversorcoin.databinding.ActivityMainBinding
import com.example.conversorcoin.databinding.CustomToastEuroBinding
import com.example.conversorcoin.databinding.CustomToastDollarBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var customToastDollarBinding: CustomToastDollarBinding
    private lateinit var customToastEuroBinding: CustomToastEuroBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        customToastDollarBinding = CustomToastDollarBinding.inflate(layoutInflater)
        customToastEuroBinding = CustomToastEuroBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var real = Float

        binding.button.setOnClickListener {
            real = binding.valorReal.text.toString()
        }



    }
}
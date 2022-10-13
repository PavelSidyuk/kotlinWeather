package com.example.kotlinweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinweather.databinding.ActivityMainBinding
import com.example.kotlinweather.view.weatherlist.WeatherFragment

class MainActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.container,WeatherFragment.newInstance()).commit()
        }
    }
}
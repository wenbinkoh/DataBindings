package com.android.example.databindings

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.example.databindings.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnDisplay.setOnClickListener(){

            var p =  Person( name= "kohwenbin", email = "wb0612@gmail.com", icNo = "123456-10-6444", address = "Block A-07-17, Jalan 9/6")

            binding.personDetail = p

        }

        binding.btnSecond.setOnClickListener(){

            var p =  Person( name= "Chchim", email = "chchim0101@gmail.com", icNo = "123456-10-9876", address = "17, Jalan 1/6")

            binding.personDetail = p
        }
    }
}
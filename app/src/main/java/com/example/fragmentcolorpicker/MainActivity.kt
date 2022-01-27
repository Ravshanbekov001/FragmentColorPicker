package com.example.fragmentcolorpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = MainFragment()
        val colorFragment = ColorFragment()

        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .add(R.id.liner_container, mainFragment)
            .commit()


    }
}
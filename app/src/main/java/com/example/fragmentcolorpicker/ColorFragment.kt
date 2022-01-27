package com.example.fragmentcolorpicker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_color.view.*
import kotlinx.android.synthetic.main.fragment_main.*
import utils.MyColor

class ColorFragment : Fragment() {

    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val mainFragment = MainFragment()

        val fragmentFragment = parentFragmentManager

        root = inflater.inflate(R.layout.fragment_color, container, false)

        root.red.setOnClickListener {
            MyColor.myColor = 1

            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.yellow.setOnClickListener {
            MyColor.myColor = 2
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.green.setOnClickListener {
            MyColor.myColor = 3
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.blue.setOnClickListener {
            MyColor.myColor = 4
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.dark_blue.setOnClickListener {
            MyColor.myColor = 5
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.purple.setOnClickListener {
            MyColor.myColor = 6
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.purple2.setOnClickListener {
            MyColor.myColor = 7
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.pink.setOnClickListener {
            MyColor.myColor = 8
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.grey.setOnClickListener {
            MyColor.myColor = 9
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.grey2.setOnClickListener {
            MyColor.myColor = 10
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.noName.setOnClickListener {
            MyColor.myColor = 11
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }
        root.noName2.setOnClickListener {
            MyColor.myColor = 12
            fragmentFragment.beginTransaction()
                .replace(R.id.liner_container, mainFragment)
                .commit()
        }

        return root
    }

}
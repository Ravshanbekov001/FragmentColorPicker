package com.example.fragmentcolorpicker

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import utils.MyColor

class MainFragment : Fragment() {

    private lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        val colorFragment = ColorFragment()
        val fragmentManager = parentFragmentManager

        root = inflater.inflate(R.layout.fragment_main, container, false)

        root.card_edit.setOnClickListener {
            fragmentManager.beginTransaction()
                .replace(R.id.liner_container, colorFragment)
                .commit()
        }
        return root
    }

    override fun onStart() {
        super.onStart()

        when (MyColor.myColor) {
            1 -> mainFragment.setBackgroundColor(Color.parseColor("#EF3B3B"))
            2 -> mainFragment.setBackgroundColor(Color.parseColor("#EAD72F"))
            3 -> mainFragment.setBackgroundColor(Color.parseColor("#78DA2B"))
            4 -> mainFragment.setBackgroundColor(Color.parseColor("#5DE4CC"))
            5 -> mainFragment.setBackgroundColor(Color.parseColor("#2C7DB8"))
            6 -> mainFragment.setBackgroundColor(Color.parseColor("#4B35CE"))
            7 -> mainFragment.setBackgroundColor(Color.parseColor("#BF5FE0"))
            8 -> mainFragment.setBackgroundColor(Color.parseColor("#D43294"))
            9 -> mainFragment.setBackgroundColor(Color.parseColor("#864343"))
            10 -> mainFragment.setBackgroundColor(Color.parseColor("#BFA050"))
            11 -> mainFragment.setBackgroundColor(Color.parseColor("#351A63"))
            12 -> mainFragment.setBackgroundColor(Color.parseColor("#781189"))
        }
    }
}
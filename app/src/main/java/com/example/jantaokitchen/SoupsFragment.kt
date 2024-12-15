package com.example.jantaokitchen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class SoupsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_soups, container, false)

        val backButton = view.findViewById<Button>(R.id.btn_back)

        backButton.setOnClickListener {
            requireActivity().onBackPressed() // Возврат назад
        }

        return view
    }
}

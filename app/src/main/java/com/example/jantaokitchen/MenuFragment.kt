package com.example.jantaokitchen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val soupsButton = view.findViewById<Button>(R.id.btn_soups)
        soupsButton?.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_soupsFragment)
        }
        return view
    }
}

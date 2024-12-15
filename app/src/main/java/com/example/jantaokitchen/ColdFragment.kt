package com.example.jantaokitchen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class ColdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_cold, container, false)

        val backButton = view.findViewById<Button>(R.id.btn_back)

        backButton?.setOnClickListener {
            findNavController().navigateUp() // Более корректный возврат
        }

        return view
    }
}
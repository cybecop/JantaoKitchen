package com.example.jantaokitchen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val loginField = view.findViewById<EditText>(R.id.et_login)
        val passwordField = view.findViewById<EditText>(R.id.et_password)
        val loginButton = view.findViewById<Button>(R.id.btn_login)

        loginButton?.setOnClickListener {
            val login = loginField?.text.toString()
            val password = passwordField?.text.toString()

            if (login == "Pachok" && password == "nootnoot90") {
                Toast.makeText(context, "Welcome, Chef!", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_mainFragment_to_homeFragment)
            } else {
                Toast.makeText(context, "Invalid login or password", Toast.LENGTH_SHORT).show()
            }
        }
        return view
    }
}

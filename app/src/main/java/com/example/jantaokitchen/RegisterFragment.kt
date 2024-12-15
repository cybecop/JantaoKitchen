package com.example.jantaokitchen

import android.content.ContentValues
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class RegisterFragment : Fragment() {

    private lateinit var databaseHelper: DatabaseHelper

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        databaseHelper = DatabaseHelper(requireContext())

        val loginField = view.findViewById<EditText>(R.id.et_register_login)
        val passwordField = view.findViewById<EditText>(R.id.et_register_password)
        val registerButton = view.findViewById<Button>(R.id.btn_register_submit)

        registerButton.setOnClickListener {
            val login = loginField.text.toString()
            val password = passwordField.text.toString()

            if (login.isNotEmpty() && password.isNotEmpty()) {
                val values = ContentValues().apply {
                    put("login", login)
                    put("password", password)
                }

                val db = databaseHelper.writableDatabase
                val rowId = db.insert("users", null, values)
                if (rowId != -1L) {
                    Toast.makeText(context, "Registration successful!", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_registerFragment_to_homeFragment)
                } else {
                    Toast.makeText(context, "Registration failed", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(context, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}

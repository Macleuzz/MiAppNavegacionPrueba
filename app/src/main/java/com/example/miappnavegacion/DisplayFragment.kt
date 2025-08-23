package com.example.miappnavegacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DisplayFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_display, container, false)
        val displayTextView: TextView = view.findViewById(R.id.text_view_display)

        // Obtener el dato del Intent de la Activity
        val userName = activity?.intent?.getStringExtra("USER_NAME")
        displayTextView.text = "¡Hola, $userName!"

        return view
    }
}

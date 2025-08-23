package com.example.miappnavegacion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import android.content.Intent

class InputFragment : Fragment() {
    private lateinit var inputEditText: EditText
    private val TEXT_KEY = "input_text_key"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_input, container, false)
        inputEditText = view.findViewById(R.id.edit_text_input)
        val sendButton: Button = view.findViewById(R.id.button_send)

        sendButton.setOnClickListener {
            // Navegación con Intent
            val intent = Intent(requireContext(), DisplayActivity::class.java).apply {
                putExtra("USER_NAME", inputEditText.text.toString())
            }
            startActivity(intent)
        }

        return view
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }
}

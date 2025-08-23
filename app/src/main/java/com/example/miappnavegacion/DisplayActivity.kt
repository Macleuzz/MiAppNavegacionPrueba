package com.example.miappnavegacion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace( R.id.fragment_container, DisplayFragment())
                .commit()

        }
    }
}

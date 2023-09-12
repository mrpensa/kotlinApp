package com.example.helloworldandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
        val fragment = pantallaUnoFragment()
        val transaction = fragmentManager.beginTransaction()

        transaction.replace(R.id.fragment_container, fragment)

        transaction.commit()
    }
}

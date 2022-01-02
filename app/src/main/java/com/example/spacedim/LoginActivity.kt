package com.example.spacedim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.content.Intent


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginStartBtn = findViewById<ImageButton>(R.id.login_start_btn)
        val loginExitBtn = findViewById<ImageButton>(R.id.login_exit_btn)
        loginStartBtn.setOnClickListener{
            val intent = Intent(this, WaitingRoomActivity::class.java)
            startActivity(intent)
        }
        loginExitBtn.setOnClickListener{
            finish();
            System.exit(0);
        }
    }
}
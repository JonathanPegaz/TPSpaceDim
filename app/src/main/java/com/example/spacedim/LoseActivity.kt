package com.example.spacedim

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LoseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)
        val exitBtn = findViewById<ImageButton>(R.id.lose_exit_button)
        val replayBtn = findViewById<ImageButton>(R.id.lose_replay_button)
        exitBtn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        replayBtn.setOnClickListener{
            val intent = Intent(this, WaitingRoomActivity::class.java)
            startActivity(intent)
        }
    }
}
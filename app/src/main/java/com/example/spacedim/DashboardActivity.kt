package com.example.spacedim

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        val loseBtn = findViewById<Button>(R.id.dashboard_lose_btn)
        val winBtn = findViewById<Button>(R.id.dashboard_win_btn)
        loseBtn.setOnClickListener{
            val intent = Intent(this, LoseActivity::class.java)
            startActivity(intent)
        }
        winBtn.setOnClickListener{
            val intent = Intent(this, WinActivity::class.java)
            startActivity(intent)
        }
    }
}
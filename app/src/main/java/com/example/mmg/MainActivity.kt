package com.example.mmg

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders

class MainActivity: AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var pb: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get<MainViewModel>(MainViewModel::class.java)
        //mainViewModel.getUrls("sasha");

        //mainViewModel.getUrls("sasha");
        pb = findViewById<View>(R.id.progcircle) as ProgressBar
    }
}
package com.example.mmg.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import com.example.mmg.viewmodel.MainViewModel
import com.example.mmg.R
import com.example.mmg.model.DateModel
import timber.log.Timber
import java.util.*

class MainActivity: AppCompatActivity() {

    private val mainViewModel: MainViewModel by lazy{
        ViewModelProviders.of(this).get<MainViewModel>(
            MainViewModel::class.java)
    }

    private val date = DateModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.mmg

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.ProgressBar
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import java.io.IOException
import java.net.URL
import java.util.*

class MainActivity: AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    lateinit var pb: ProgressBar
    var dic = HashMap<String, String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get<MainViewModel>(MainViewModel::class.java)
        //mainViewModel.getUrls("sasha");

        //mainViewModel.getUrls("sasha");
        pb = findViewById<View>(R.id.progcircle) as ProgressBar

        val spinner = findViewById<Spinner>(R.id.topview_spinner)

        dic["공대식당"] = "https://www.skku.edu/skku/campus/support/welfare_11_1.do?mode=info&conspaceCd=20201097&srResId=10&srShowTime=D&srCategory=L"
        dic["학생회관 식당"] = "https://www.skku.edu/skku/campus/support/welfare_11_1.do?mode=info&srDt=2019-03-12&srCategory=L&conspaceCd=20201104&srResId=3&srShowTime=D"

        val artistList = ArrayList<String>()
        val keys: Iterator<String> = dic.keys.iterator()
        while (keys.hasNext()) {
            val artistName = keys.next()
            artistList.add(artistName)
        }

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, artistList)
        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onItemSelected(
                arg0: AdapterView<*>?, arg1: View,
                position: Int, id: Long
            ) {
                val artistName = artistList[position]
                val artistValue = dic[artistName]
                /*mainViewModel.urls.clear()
                adapter.removeAll()
                try {
                    GetHttpAsync(
                        pb,
                        adapter,
                        mainViewModel
                    ).execute(URL("https://www.gettyimagesgallery.com/collection/$artistValue/"))
                } catch (e: IOException) {
                    Log.e("err", e.toString())
                }*/
            }

            override fun onNothingSelected(arg0: AdapterView<*>?) {}
        }
    }
}
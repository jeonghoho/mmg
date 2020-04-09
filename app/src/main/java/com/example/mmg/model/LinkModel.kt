package com.example.mmg.model

import java.util.*

class LinkModel(val dateModel: DateModel, val type: Int){
    companion object{
        val NS_ENGINEER = 0
        val NS_STUDENT = 1
        val NS_PROFESSOR = 2
    }
    init{
        val date = dateModel.date
        val year = date.get("year") ?: "2019"
        val month = date.get("month") ?: "04"
        val day = date.get("day") ?: "09"
        val wholeDate = "$year-$month-$day"
        val time = date.get("time") ?: "D"
        val link: String = when(type){
            NS_ENGINEER -> {
                "https://www.skku.edu/skku/campus/support/welfare_11_1.do?mode=info&srDt=$wholeDate&srCategory=$time&conspaceCd=20201097&srResId=10&srShowTime=D"
            }
            NS_STUDENT -> {
                "https://www.skku.edu/skku/campus/support/welfare_11_1.do?mode=info&srDt=$wholeDate&srCategory=$time&conspaceCd=20201104&srResId=3&srShowTime=D"
            }
            NS_PROFESSOR -> {
                "https://www.skku.edu/skku/campus/support/welfare_11_1.do?mode=info&srDt=$wholeDate&srCategory=$time&conspaceCd=20201040&srResId=11&srShowTime=D"
            }
            else -> {
                "invalid url"
            }
        }
    }
}
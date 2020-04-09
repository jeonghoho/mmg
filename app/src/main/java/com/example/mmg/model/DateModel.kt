package com.example.mmg.model

class DateModel{
    val date: HashMap<String, String> = HashMap()
    constructor(year: String = "2019", month: String = "04",
                day: String = "09", time: String = "morning"){
        date.set("year", year)
        date.set("month", month)
        date.set("day", day)
        date.set("time", time)
    }
}
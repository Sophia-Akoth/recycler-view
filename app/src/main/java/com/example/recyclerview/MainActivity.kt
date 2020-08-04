package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.NamesRecyclerViewAdapter
data class Person(val name:String,val age:Int,val dateOfBirth:Int,val hobby:String)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvName.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NamesRecyclerViewAdapter(listOf(Person("Sophia",23,1997,"Dancing"),
            Person("Ade",8,2012,"singing"),
            Person("Robert",17,2003,"football"),Person("Moses",27,1992,"Rugby"),Person("George",30,1989,"Eating"),Person("Mary",20,2000,"running"),Person("Becks",22,1998,"yodeling"),Person("Asu",26,1994,"music"),Person("Jane",52,1968,"cooking"),Person("James",60,1960,"fishing"))
        rvName.adapter = namesAdapter
    }
}
package com.example.scrollbarthrowaway

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById(R.id.recyclerview) as RecyclerView
        val lm = LinearLayoutManager(this)
        rv.layoutManager = lm
        val adapter = MyAdapter(layoutInflater)
        rv.adapter = adapter

        val items = listOf(100, 800, 300, 200, 100, 100, 100, 100, 100, 100, 100, 100, 100, 800, 100, 700, 200).map {
            ListItem(it)
        }

        adapter.items = items
    }
}

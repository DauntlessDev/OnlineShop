package com.dauntlessdev.onlineshop.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.dauntlessdev.onlineshop.Model.Category
import com.dauntlessdev.onlineshop.R
import com.dauntlessdev.onlineshop.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter<Category>(this, android.R.layout.simple_list_item_1, DataService.categories)
        categoryListView.adapter = adapter
    }
}

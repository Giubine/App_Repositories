package com.example.apprepositories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.widget.SearchView
import com.example.apprepositories.R
import com.example.apprepositories.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), SearchView.OnQueryTextListener {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
      val searchView =  menu?.findItem(R.id.action_search)?.actionView as SearchView
        searchView.setOnQueryTextListener(this)
        return super.onCreateOptionsMenu(menu)
    }

   override fun onQueryTextSubmit(query: String): Boolean{
        Log.e("TAG", "onQueryTextSubmit: $query")
        return true
    }
   override fun onQueryTextChange(newText: String): Boolean{
        Log.e("TAG", "onQueryTextChange: $newText")
        return true
    }

    companion object{
        private const val  TAG =  "TAG"
    }

}
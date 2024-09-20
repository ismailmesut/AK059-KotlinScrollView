package com.ismailmesutmujde.kotlinscrollview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinscrollview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)


    }
}
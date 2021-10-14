package com.consoli.test4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testlibrary.LibraryInterface

class MainActivity : AppCompatActivity(), LibraryInterface {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onInitialize() {

    }

    override fun onFailure() {

    }

    override fun onSuccess() {

    }
}
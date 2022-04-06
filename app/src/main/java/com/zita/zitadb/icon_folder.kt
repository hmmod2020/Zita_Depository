package com.zita.zitadb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton

class icon_folder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icon_folder)
        var arr= arrayListOf<Long>()
        for (n in 1 until 10 ){
            arr.add(1)
        }
        findViewById<GridView>(R.id.grid2).adapter=icon_adb(this,arr)

        findViewById<ImageButton>(R.id.backCusPro2).setOnClickListener {

            finish()
        }
    }
}
package com.zita.zitadb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton

class entire_folder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entire_folder)
        var arr= arrayListOf<Long>()
        for (n in 1 until 10 ){
            arr.add(1)
        }
        findViewById<GridView>(R.id.grid1).adapter=pic_adb(this,arr)

        findViewById<ImageButton>(R.id.backCusPro1).setOnClickListener {

            finish()
        }

    }
}
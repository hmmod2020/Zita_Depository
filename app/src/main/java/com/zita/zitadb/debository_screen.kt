package com.zita.zitadb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageButton

class debository_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_debository_screen)
        var array= arrayListOf<String>()

        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")
        array.add("project")


        var gridView=findViewById<GridView>(R.id.gridView)
        findViewById<ImageButton>(R.id.backDepo).setOnClickListener {
            finish()

        }

        gridView.adapter=gridAdb(this,array)

    }
}
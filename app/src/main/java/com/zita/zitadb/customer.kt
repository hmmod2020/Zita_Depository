package com.zita.zitadb

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.ListView
import com.getbase.floatingactionbutton.FloatingActionButton

class customer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer)
        var arr= arrayListOf<String>()

        for (n in 1 until 10 ){
            arr.add("")
        }




      findViewById<ListView>(R.id.listView).adapter=cusAdb(this,arr)





    }


    override fun onStart() {


        findViewById<ImageButton>(R.id.backCus).setOnClickListener {
            finish()

        }
        findViewById<FloatingActionButton>(R.id.addProject).setOnClickListener {
            dilog_customer(this as Activity).startDialog()
        }

        super.onStart()
    }
}
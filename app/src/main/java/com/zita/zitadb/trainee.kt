package com.zita.zitadb

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ListView
import com.getbase.floatingactionbutton.FloatingActionButton

class trainee : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trainee)

        var arr= arrayListOf<String>()

        for (n in 1 until 10 ){
            arr.add("")
        }
        findViewById<ImageButton>(R.id.backCus2).setOnClickListener {

            finish()

        }
        findViewById<FloatingActionButton>(R.id.addProject2).setOnClickListener {
            dilog_trainee(this as Activity).startDialog()
        }
        findViewById<ListView>(R.id.listView2).adapter=trainee_adb(this,arr)
    }

}
package com.zita.zitadb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout

class project : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        findViewById<ImageButton>(R.id.delete_pic).setOnClickListener {
            dilog(this).startDialog()
        }
        findViewById<ImageButton>(R.id.delete_code).setOnClickListener {
            dilog(this).startDialog()
        }
        findViewById<ImageButton>(R.id.delete_srs).setOnClickListener {
            dilog(this).startDialog()
        }
        findViewById<ImageButton>(R.id.delete_code).setOnClickListener {
            dilog(this).startDialog()
        }

        findViewById<ImageButton>(R.id.backCusPro).setOnClickListener {

            finish()
        }

        findViewById<LinearLayout>(R.id.pic_enter).setOnClickListener {
            startActivity(Intent(this,entire_folder::class.java))

        }
        findViewById<LinearLayout>(R.id.iconPro).setOnClickListener {
            startActivity(Intent(this,icon_folder::class.java))

        }

        findViewById<LinearLayout>(R.id.srsPro).setOnClickListener {
            startActivity(Intent(this,files_show::class.java))

        }
        findViewById<LinearLayout>(R.id.CodePro).setOnClickListener {
            startActivity(Intent(this,code_show::class.java))

        }


    }
}
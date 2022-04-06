package com.zita.zitadb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class mainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        var intet=Intent(this,debository_screen::class.java)

        var debpositoryBtn=findViewById<Button>(R.id.DepositoryBtn)

        findViewById<Button>(R.id.customerBtn).setOnClickListener {

            startActivity(Intent(this,customer::class.java))


        }

        findViewById<Button>(R.id.traineesBtn).setOnClickListener {
            startActivity(Intent(this,trainee::class.java))
        }

        debpositoryBtn.setOnClickListener {


            startActivity(intet)

        }



    }
}
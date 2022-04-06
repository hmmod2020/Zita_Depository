package com.zita.zitadb

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class code_show : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_show)

        var arrData=ArrayList<data_rec>()

        arrData.add(data_rec(R.drawable.py,"ziat.py"))
        arrData.add(data_rec(R.drawable.java,"ziat.java"))
        arrData.add(data_rec(R.drawable.kt,"ziat.kt"))
        arrData.add(data_rec(R.drawable.java,"hmmod.java"))
        arrData.add(data_rec(R.drawable.kt,"MBS.kt"))
        arrData.add(data_rec(R.drawable.py,"alaa.py"))
        arrData.add(data_rec(R.drawable.java,"android.java"))
        arrData.add(data_rec(R.drawable.py,"flutter.py"))
        arrData.add(data_rec(R.drawable.kt,"kotlin.kt"))
        arrData.add(data_rec(R.drawable.py,"dell.py"))
        arrData.add(data_rec(R.drawable.java,"noligy.java"))
        arrData.add(data_rec(R.drawable.kt,"NDS.kt"))
        arrData.add(data_rec(R.drawable.py,"Sust.py"))
        arrData.add(data_rec(R.drawable.kt,"Sust.kt"))
        arrData.add(data_rec(R.drawable.java,"Scova.java"))


        findViewById<ImageButton>(R.id.backCusPro3).setOnClickListener {

            finish()
        }
        var rec =findViewById<RecyclerView>(R.id.rse1)
        var adb=rec_adb(arrData)

        rec.layoutManager= LinearLayoutManager(this, LinearLayout.VERTICAL,false)
        rec.adapter=adb

    }
}
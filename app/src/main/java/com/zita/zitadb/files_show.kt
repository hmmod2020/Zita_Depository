package com.zita.zitadb

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class files_show : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_files_show)


      var arrData=ArrayList<data_rec>()

        arrData.add(data_rec(R.drawable.pdf,"ziat.pdf"))
        arrData.add(data_rec(R.drawable.exel,"ziat.xlsx"))
        arrData.add(data_rec(R.drawable.word,"ziat.doc"))
        arrData.add(data_rec(R.drawable.pdf,"hmmod.pdf"))
        arrData.add(data_rec(R.drawable.exel,"MBS.xlsx"))
        arrData.add(data_rec(R.drawable.word,"alaa.doc"))
        arrData.add(data_rec(R.drawable.pdf,"android.pdf"))
        arrData.add(data_rec(R.drawable.exel,"flutter.xlsx"))
        arrData.add(data_rec(R.drawable.word,"kotlin.doc"))
        arrData.add(data_rec(R.drawable.pdf,"dell.pdf"))
        arrData.add(data_rec(R.drawable.exel,"noligy.xlsx"))
        arrData.add(data_rec(R.drawable.word,"NDS.doc"))
        arrData.add(data_rec(R.drawable.pdf,"Sust.pdf"))
        arrData.add(data_rec(R.drawable.exel,"Sust.xlsx"))
        arrData.add(data_rec(R.drawable.word,"Scova.doc"))



        findViewById<ImageButton>(R.id.backCusPro1).setOnClickListener {

            finish()
        }



        var rec =findViewById<RecyclerView>(R.id.rse)
        var adb=rec_adb(arrData)

        rec.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        rec.adapter=adb

    }
}
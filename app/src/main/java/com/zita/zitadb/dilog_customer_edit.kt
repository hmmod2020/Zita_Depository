package com.zita.zitadb

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Button
import android.widget.ImageButton

class dilog_customer_edit (var activity: Activity) {

    var dialog  = Dialog(activity)
    var inf = activity.layoutInflater.inflate(R.layout.customer_data_edit,null,false)

    fun startDialog (){
        dialog.setContentView(inf)
        dialog.setCancelable(false)
        dialog.window!!.attributes.windowAnimations=R.style.anim
        dialog.show()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog.window!!.setLayout(800,1500)

        inf.findViewById<ImageButton>(R.id.cancel_dilog_customer2).setOnClickListener {

            dissDialog()
        }

        inf.findViewById<Button>(R.id.apply_save_customer2).setOnClickListener {

            dissDialog()
        }


    }

    fun dissDialog(){
        dialog.dismiss()
    }


}
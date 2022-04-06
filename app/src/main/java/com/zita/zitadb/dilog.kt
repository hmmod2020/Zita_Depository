package com.zita.zitadb
import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageButton

class dilog(var activity: Activity) {

    var dialog  = Dialog(activity)
    var inf = activity.layoutInflater.inflate(R.layout.kharoofi,null,false)

    fun startDialog (){
        dialog.setContentView(inf)
        dialog.setCancelable(false)
        dialog.window!!.attributes.windowAnimations=R.style.anim
        dialog.show()
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        dialog.window!!.setLayout(750,450)

        inf.findViewById<Button>(R.id.yes_delet).setOnClickListener {
            dissDialog()
        }
        inf.findViewById<Button>(R.id.No_delet).setOnClickListener {
            dissDialog()
        }
        inf.findViewById<ImageButton>(R.id.cancle_delete_customer).setOnClickListener {
            dissDialog()
        }

    }

    fun dissDialog(){
        dialog.dismiss()
    }


}
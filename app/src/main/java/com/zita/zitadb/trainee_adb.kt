package com.zita.zitadb

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import java.util.ArrayList

class trainee_adb  (context : Context, str: ArrayList<String>) : ArrayAdapter<String>(context,0,str){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var view = LayoutInflater.from(context).inflate(R.layout.card_of_trainee,parent,false)
        view.findViewById<LinearLayout>(R.id.butn_edit2).setOnClickListener {

            dilog_trainee_edit(context as Activity).startDialog()


        }

        view.findViewById<LinearLayout>(R.id.butn_delete2).setOnClickListener {
            dilog(context as Activity).startDialog()
        }

        return view



    }


}
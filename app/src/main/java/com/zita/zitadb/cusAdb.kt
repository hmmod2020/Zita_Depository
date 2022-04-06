package com.zita.zitadb

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import java.util.ArrayList

class cusAdb ( context :Context, str:ArrayList<String>) :ArrayAdapter<String>(context,0,str){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

         var view =LayoutInflater.from(context).inflate(R.layout.card_of_customer,parent,false)
        view.findViewById<LinearLayout>(R.id.butn_edit).setOnClickListener {

            dilog_customer_edit(context as Activity).startDialog()


        }

        view.findViewById<LinearLayout>(R.id.butn_delete).setOnClickListener {
            dilog(context as Activity).startDialog()
        }

        return view



    }


}
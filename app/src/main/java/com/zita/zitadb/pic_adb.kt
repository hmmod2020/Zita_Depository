package com.zita.zitadb

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class pic_adb(var context: Context, var arr:ArrayList<Long>) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.show_file_pic,parent,false)
        view.findViewById<LinearLayout>(R.id.delete_item).setOnClickListener {

            dilog(context as Activity).startDialog()
        }

        return view
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }


    override fun getItemId(position: Int): Long {
        return arr[position]
    }

    override fun getCount(): Int {

        return arr.size
    }
}
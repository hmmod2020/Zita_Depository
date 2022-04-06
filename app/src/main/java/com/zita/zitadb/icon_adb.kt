package com.zita.zitadb

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout

class icon_adb (var context: Context, var arr:ArrayList<Long>) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = LayoutInflater.from(context).inflate(R.layout.show_icon_grid,parent,false)
        view.findViewById<LinearLayout>(R.id.delete_item1).setOnClickListener {

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
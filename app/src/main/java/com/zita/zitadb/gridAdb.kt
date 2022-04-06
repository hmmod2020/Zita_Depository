package com.zita.zitadb

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import java.security.AccessControlContext

class gridAdb (var context: Context,var arr:ArrayList<String>) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view =LayoutInflater.from(context).inflate(R.layout.test_component,parent,false)
        var projectName = view.findViewById<TextView>(R.id.projecName)
        var text=arr[position]
        projectName.text=text
        var intent=Intent(context,project::class.java)
        view.findViewById<ImageButton>(R.id.enterToProject).setOnClickListener {

            startActivity(context,intent,null)

        }

        return view
    }

    override fun getItem(position: Int): Any {
        TODO("Not yet implemented")
    }


    override fun getItemId(position: Int): Long {
        return arr[position].toLong()
    }

    override fun getCount(): Int {

      return arr.size
    }
}
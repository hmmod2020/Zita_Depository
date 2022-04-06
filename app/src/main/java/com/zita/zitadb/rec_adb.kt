package com.zita.zitadb

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class rec_adb (var data :ArrayList<data_rec>): RecyclerView.Adapter<rec_adb.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){

         var pic=view.findViewById<CircleImageView>(R.id.image1) as CircleImageView
         var fileName=view.findViewById<TextView>(R.id.FileName) as TextView



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

       var veiw=LayoutInflater.from(parent.context).inflate(R.layout.test,parent,false)

        veiw.findViewById<ImageButton>(R.id.delete_pic20).setOnClickListener {

            dilog(parent.context as Activity).startDialog()
        }

        return ViewHolder(veiw)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data_view=data[position]
        holder.fileName.text=data_view.nameOfFile
        holder.pic.setImageResource(data_view.img)
    }

    override fun getItemCount(): Int {
        return data.size
    }


}
package com.kumsal.liketwitterprofile_motionlayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class PostAdapter:RecyclerView.Adapter<PostAdapter.postHolder>{
    var context:Context?=null

    constructor(context: Context?) : super() {
        this.context = context
    }

    inner class postHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var imageView:CircleImageView=itemView.findViewById(R.id.imageViewForModel)
        var textViewName:TextView=itemView.findViewById(R.id.name)
        var status:TextView=itemView.findViewById(R.id.status)
        fun holderBindElement(name:String,status:String){
            imageView.setImageResource(R.drawable.profil)
            textViewName.setText(name)
            this.status.setText(status)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.postHolder {
        var view=LayoutInflater.from(context).inflate(R.layout.recycler_model_single,parent,false)
        return postHolder(view)
    }

    override fun onBindViewHolder(holder: PostAdapter.postHolder, position: Int) {
        holder.holderBindElement("Aleyna","Yaşamdan izler insanın anlaması noktasnda ki kararlarını sorgullatmayı gerektirir")
    }

    override fun getItemCount(): Int {
        return 16
    }
}
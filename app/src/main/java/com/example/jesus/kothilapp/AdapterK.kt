package com.example.jesus.kothilapp

import android.view.View
import kotlinx.android.synthetic.main.koth_intent.*
import kotlinx.android.synthetic.main.koth_intent.view.*

/**
 * Created by jesus on 8/05/17.
 */
class AdapterK : RecyclerView.Adapter<>()  {

    override fun getItemCount() = craftList.size

    class MyViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView){
        func bind(get:_Craft) {
            itemView.text_intent1.text = craft.name
            itemView.image_intent1.loadImage(craft.imageUrl)
        }
    }
}
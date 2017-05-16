package com.example.jesus.kothilapp

import android.widget.ImageView

/**
 * Created by jesus on 8/05/17.
 */


fun ImageView.loadImage(url:String?) {
    //Hotlin exige la validacion de valores nulos
    if(url != null) {
        Glide.width(this.context)
                .load(url)
                .fitCenter()
                .into(this)
    }
}

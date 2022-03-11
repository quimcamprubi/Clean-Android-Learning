package com.cursokotlin.mvvmexample.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso

class BindingAdapters {
    companion object {
        @BindingAdapter("imageUrl")
        @JvmStatic
        fun loadImage(view: ImageView, url: String?) {
            if(!url.isNullOrEmpty())
                Picasso.with(view.context).load(url).into(view)
            else Picasso.with(view.context).load("https://www.hostingplus.pe/wp-content/uploads/2020/02/error.jpg").into(view)
        }
    }

}
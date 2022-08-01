package com.skiptheweb.myshoppal.utils

import android.content.Context
import android.net.Uri
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.skiptheweb.myshoppal.R
import java.io.IOException
import java.net.URI

class GlideLoader(val context: Context) {

    fun loadUserPicture(imageUri: Uri, imageView: ImageView) {

        try {
             //load the image user in the image view

            Glide
                .with(context)
                .load(imageUri)
                .centerCrop()
                .placeholder(R.drawable.ic_user_placeholder)
                .into(imageView)

        } catch (e: IOException) {
            e.printStackTrace()
        }

    }
}
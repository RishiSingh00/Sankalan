package com.example.sankalan.adapter

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.sankalan.R
import java.util.concurrent.Executors

class GalleryListAdapter(private val imageList:ArrayList<Bitmap>):RecyclerView.Adapter<GalleryListAdapter.GalleryAdapter>() {

    class GalleryAdapter(v:View):RecyclerView.ViewHolder(v){
        val gallery_image = v.findViewById<ImageView>(R.id.image_gallery_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryAdapter {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.gallery_layout,parent,false)
        return GalleryAdapter(v)
    }

    override fun onBindViewHolder(holder: GalleryAdapter, position: Int) {

       holder.gallery_image.setImageBitmap(imageList[position])
    }

    override fun getItemCount(): Int  = imageList.size
}
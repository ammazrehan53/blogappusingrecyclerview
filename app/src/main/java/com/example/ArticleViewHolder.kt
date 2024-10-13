package com.example

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.blogappusingrecyclerview.R

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.img1)
    val descriptionView: TextView = itemView.findViewById(R.id.des1)
    val longdesView: TextView = itemView.findViewById(R.id.longdes)


}
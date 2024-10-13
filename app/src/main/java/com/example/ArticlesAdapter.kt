package com.example

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blogappusingrecyclerview.R

class ArticlesAdapter(val articles: List<Article>):RecyclerView.Adapter<ArticleViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
   return ArticleViewHolder(view)
    }

    override fun getItemCount(): Int {
return articles.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
val article = articles.get(position)
        holder.imageView.setImageResource(article.imageid)
        holder.descriptionView.text = article.des1
holder.longdesView.text = article.longdes
holder.itemView.setOnClickListener {
    val intent = Intent( holder.itemView.context, detail1::class.java)
   intent.putExtra("img1", article.imageid)
    intent.putExtra("des1", article.des1)
    intent.putExtra("longdes", article.longdes)
    holder.itemView.context.startActivity(intent)
}
    }
}
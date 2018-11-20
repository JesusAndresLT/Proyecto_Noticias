package com.example.ndread.proy_noticas_peru.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import com.example.ndread.proy_noticas_peru.models.Noticias
import android.view.View
import android.view.ViewGroup
import com.example.ndread.proy_noticas_peru.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.card_news.view.*


class NoticiasAdapter(val news:List<Noticias>): RecyclerView.Adapter<NoticiasAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_news,parent,false))


    override fun getItemCount(): Int= news.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int)=holder.bind(news[position])

    class ViewHolder(item: View):RecyclerView.ViewHolder(item){
        fun bind(noticias:Noticias){
            itemView.nombreNew.text= noticias.newsNombre
            Picasso.get().load(noticias.newsUrl).into(itemView.imageNew)
        }


    }





}
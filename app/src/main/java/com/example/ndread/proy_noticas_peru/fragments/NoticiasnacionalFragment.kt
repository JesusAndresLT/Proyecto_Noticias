package com.example.ndread.proy_noticas_peru.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.ndread.proy_noticas_peru.R
import com.example.ndread.proy_noticas_peru.adapters.NoticiasAdapter
import com.example.ndread.proy_noticas_peru.models.Noticias
import kotlinx.android.synthetic.main.fragment_noticiasnacional.view.*


class NoticiasnacionalFragment : Fragment() {


    private lateinit var recycler: RecyclerView
    private lateinit var  adaptador:NoticiasAdapter

    private val lm by lazy{ LinearLayoutManager(context) }
    private val lista: ArrayList<Noticias> = ArrayList()



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root= inflater.inflate(R.layout.fragment_noticiasnacional, container, false)

        recycler = root.recyclerSalidas as RecyclerView
        setupRecycler()
        getnoticias()
        return root

    }

    private fun setupRecycler() {
        recycler.setHasFixedSize(true)
        recycler.itemAnimator= DefaultItemAnimator()
        recycler.layoutManager=lm
        adaptador= NoticiasAdapter(lista)
        recycler.adapter=adaptador
    }

    private fun getnoticias(){

              lista.add(Noticias("Odebrecht","https://firebasestorage.googleapis.com/v0/b/noticias-52dec.appspot.com/o/Noticias%2Fode.jpg?alt=media&token=aa4f74bd-9eb3-4e34-bc8a-a2e3b8438d17"))


            }

    }






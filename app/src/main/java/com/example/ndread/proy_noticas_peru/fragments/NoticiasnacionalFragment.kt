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
    private val lista: ArrayList<Noticias> by lazy {getnoticias()}


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val root= inflater.inflate(R.layout.fragment_noticiasnacional, container, false)

        recycler = root.recyclerSalidas as RecyclerView
        setupRecycler()
        return root

    }

    private fun setupRecycler() {
        recycler.setHasFixedSize(true)
        recycler.itemAnimator= DefaultItemAnimator()
        recycler.layoutManager=lm
        adaptador= NoticiasAdapter(lista)
        recycler.adapter=adaptador
    }

    private fun getnoticias(): ArrayList<Noticias> {
        return  object:ArrayList<Noticias>(){
            init{
                add(Noticias(1,"Mejor hinchada 2018",R.drawable.mhp2018))
                add(Noticias(2,"Odebretch",R.drawable.ode))
                add(Noticias(3,"Princion Preventiva",R.drawable.snk))
                add(Noticias(4,"Posible cura del sida",R.drawable.sida))
                add(Noticias(5,"Odebretch",R.drawable.ode))

            }
        }
    }




}

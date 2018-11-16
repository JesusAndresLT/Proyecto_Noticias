package com.example.ndread.proy_noticas_peru

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.ndread.proy_noticas_peru.fragments.HomeFragment
import com.example.ndread.proy_noticas_peru.fragments.NoticiainternacionalFragment
import com.example.ndread.proy_noticas_peru.fragments.NoticiasnacionalFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),
        NavigationView.OnNavigationItemSelectedListener {

    lateinit var tb: Toolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //setToolbar
        tb= tulvar as Toolbar
        tb.title="Noticias"
        //setup navigation

        setupnavigation()
        setupfragments(HomeFragment())
        nav.menu.getItem(0).isChecked=true


    }
    private fun setupnavigation() {
        val toogle= ActionBarDrawerToggle(this,drawer,tb,
                R.string.drawer_abierto,R.string.drawer_cerrado)
        toogle.isDrawerIndicatorEnabled = true
        drawer.addDrawerListener(toogle)
        toogle.syncState()
        nav.setNavigationItemSelectedListener(this)

    }

    private fun setupfragments( fragment: Fragment){
        supportFragmentManager.beginTransaction()
                .replace(R.id.frame, fragment)
                .commit()

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.home-> setupfragments(HomeFragment())
            R.id.NoticiaNacional-> setupfragments(NoticiasnacionalFragment())
            R.id.NoticiaInternacional-> setupfragments(NoticiainternacionalFragment())
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }
    override fun onBackPressed() {
        if(drawer.isDrawerOpen(GravityCompat.START))
            drawer.closeDrawer(GravityCompat.START)
        else
            super.onBackPressed()
    }


}

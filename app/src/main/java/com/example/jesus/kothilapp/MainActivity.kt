package com.example.jesus.kothilapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity(), MainView {

    //Instanciar un elemento hasta que realmente se necesita
    lateinit var recycler: RecyclerView
    val myAdapter: AdapterK = null!!

    override fun showCrafts(craftList: ArrayList<Craft>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showProgressDialog(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgressDialog() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler1) as RecyclerView

        val myAdaoter = AdapterK(arrayListOf(arrayListOf()))
        recycler = my

        myAdapter = AdapterK()

        //Asi se declaran variables
        val mainPresenter = MainPresentor(this) //Esta es una variable inmutbale, como un final
        val nombre:String = "Kotlin"

        mainPresenter.loadCraft()
    }
}

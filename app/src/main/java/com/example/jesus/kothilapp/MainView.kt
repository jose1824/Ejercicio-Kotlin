package com.example.jesus.kothilapp

import java.util.*

/**
 * Created by jesus on 8/05/17.
 */
interface MainView {
    //Asi se coloca el tipo de dato que se quiere retornar
    fun showProgressDialog(): String
    fun hideProgressDialog()

    fun showCrafts(craftList: ArrayList<Craft>)
}
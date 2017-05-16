package com.example.jesus.kothilapp

/**
 * Created by jesus on 8/05/17.
 */
class MainPresentor (val mainView: MainView) {

    fun loadCraft() {

        val crafList = arrayListOf<Craft>(
            Craft("craft 1", "", "Juan Perez"),
            Craft("craft 2", "", "Jesus Guzman")
        )

        mainView.showCrafts(crafList)
    }
}
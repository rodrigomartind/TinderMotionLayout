package com.rodrigodominguez.tindermotionlayout.scenes

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class TinderContactViewModel: ViewModel() {

    private val stream = MutableLiveData<TinderContactModel>()

    val modelStream: LiveData<TinderContactModel>
        get() = stream

    private val data = listOf(
        TinderContactCardModel(
            name = "Rodrigo Dominguez", age = 27, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#c50e29")
        ),
        TinderContactCardModel(
            name = "CerveChat Dominguez", age = 2, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#c60055")
        ),
        TinderContactCardModel(
            name = "Sofia Jerez Test", age = 27, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#aa00c7")
        ),
        TinderContactCardModel(
            name = "Maria Perez", age = 34, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#3f1dcb")
        ),
        TinderContactCardModel(
            name = "Rodrigo Dominguez", age = 27, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#0043ca")
        ),
        TinderContactCardModel(
            name = "Rodrigo Dominguez", age = 222, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#005ecb")
        ),
        TinderContactCardModel(
            name = "Perez Gonzalez", age = 45, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#00b686")
        ),
        TinderContactCardModel(
            name = "Tomas Dominguez", age = 43, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#00b248")
        ),
        TinderContactCardModel(
            name = "Rodrigo Dominguez", age = 44, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#32cb00")
        ),
        TinderContactCardModel(
            name = "Lopez Jose Jose", age = 87, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#90cc00")
        ),
        TinderContactCardModel(
            name = "Felipe Felipe Lopez", age = 23, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#c7b800")
        ),
        TinderContactCardModel(
            name = "Nicolas Lucas Test", age = 27, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#c79400")
        ),
        TinderContactCardModel(
            name = "John", age = 237, description = "Esto es una descripcion de ejemplo", backgroundColor = Color.parseColor("#c56200")
        )
    )
    private var currentIndex = 0

    private val topCard
        get() = data[currentIndex % data.size]
    private val bottomCard
        get() = data[(currentIndex + 1) % data.size]

    init {
        updateCards()
    }

    fun swipe() {
        currentIndex += 1
        updateCards()
    }

    private fun updateCards() {
        stream.value = TinderContactModel(
            cardTop = topCard,
            cardBottom = bottomCard
        )
    }

}
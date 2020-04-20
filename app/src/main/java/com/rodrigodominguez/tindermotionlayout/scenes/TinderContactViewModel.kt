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
            backgroundColor = Color.parseColor("#c50e29")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#c60055")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#aa00c7")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#3f1dcb")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#0043ca")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#005ecb")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#00b686")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#00b248")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#32cb00")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#90cc00")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#c7b800")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#c79400")
        ),
        TinderContactCardModel(
            backgroundColor = Color.parseColor("#c56200")
        )
    )
    private var currentIndex = 0

    private val topCard
        get() = data[currentIndex % data.size]
    private val bottomCard
        get() = data[(currentIndex + 1) % data.size]

    init {
        updateStream()
    }

    fun swipe() {
        currentIndex += 1
        updateStream()
    }

    private fun updateStream() {
        stream.value = TinderContactModel(
            top = topCard,
            bottom = bottomCard
        )
    }

}
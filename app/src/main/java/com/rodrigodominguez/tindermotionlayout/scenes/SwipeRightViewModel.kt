package com.rodrigodominguez.tindermotionlayout.scenes

import android.graphics.Color
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import com.rodrigodominguez.tindermotionlayout.scenes.SwipeRightCardModel
import com.rodrigodominguez.tindermotionlayout.scenes.SwipeRightModel

class SwipeRightViewModel: ViewModel() {

    private val stream = MutableLiveData<SwipeRightModel>()

    val modelStream: LiveData<SwipeRightModel>
        get() = stream

    private val data = listOf(
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#c50e29")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#c60055")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#aa00c7")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#3f1dcb")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#0043ca")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#005ecb")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#00b686")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#00b248")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#32cb00")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#90cc00")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#c7b800")
        ),
        SwipeRightCardModel(
            backgroundColor = Color.parseColor("#c79400")
        ),
        SwipeRightCardModel(
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
        stream.value = SwipeRightModel(
            top = topCard,
            bottom = bottomCard
        )
    }

}
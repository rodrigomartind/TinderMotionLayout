package com.rodrigodominguez.tindermotionlayout.scenes

import androidx.annotation.ColorInt

data class TinderContactCardModel(
    val name: String,
    val age: Int,
    val description: String,
    @ColorInt val backgroundColor: Int
)
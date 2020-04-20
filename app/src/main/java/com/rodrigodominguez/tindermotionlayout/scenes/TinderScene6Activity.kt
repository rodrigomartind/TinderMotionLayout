package com.rodrigodominguez.tindermotionlayout.scenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import com.rodrigodominguez.tindermotionlayout.R
import kotlinx.android.synthetic.main.activity_tinder_scene6.*

class TinderScene6Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinder_scene6)

//        motionLayout.setTransitionListener(object : TransitionAdapter() {
//            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
//                when (currentId) {
//                    R.id.offScreenPass,
//                    R.id.offScreenLike -> {
//                        motionLayout.progress = 0f
//                        motionLayout.setTransition(R.id.start, R.id.detail)
//                    }
//                }
//            }
//        })
    }
}
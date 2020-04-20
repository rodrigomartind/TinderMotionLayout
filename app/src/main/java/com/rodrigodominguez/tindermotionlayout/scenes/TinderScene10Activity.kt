package com.rodrigodominguez.tindermotionlayout.scenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rodrigodominguez.tindermotionlayout.R
import kotlinx.android.synthetic.main.activity_tinder_scene10.*
import kotlinx.android.synthetic.main.activity_tinder_scene9.*
import kotlinx.android.synthetic.main.activity_tinder_scene9.containerCardOne
import kotlinx.android.synthetic.main.activity_tinder_scene9.containerCardTwo
import kotlinx.android.synthetic.main.activity_tinder_scene9.motionLayout

class TinderScene10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinder_scene10)

        val viewModel = ViewModelProviders
            .of(this)
            .get(SwipeRightViewModel::class.java)

        viewModel
            .modelStream
            .observe(this, Observer {
                bindCard(it)
            })

        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                when (currentId) {
                    R.id.offScreenPass,
                    R.id.offScreenLike -> {
                        motionLayout.progress = 0f
                        motionLayout.setTransition(R.id.start, R.id.detail)
                        viewModel.swipe()
                    }
                }
            }
        })

        likeFloating.setOnClickListener {
            motionLayout.transitionToState(R.id.like)
        }

        unlikeFloating.setOnClickListener {
            motionLayout.transitionToState(R.id.unlike)
        }
    }

    private fun bindCard(model: SwipeRightModel) {
        containerCardOne.setBackgroundColor(model.top.backgroundColor)
        containerCardTwo.setBackgroundColor(model.bottom.backgroundColor)
    }

}
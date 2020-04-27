package com.rodrigodominguez.tindermotionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rodrigodominguez.tindermotionlayout.rotationcard.RotationCardActivity
import com.rodrigodominguez.tindermotionlayout.scenes.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scene_1.setOnClickListener {
            startActivity(
                Intent(this, TinderScene1Activity::class.java)
            )
        }
        scene_2.setOnClickListener {
            startActivity(
                Intent(this, TinderScene2Activity::class.java)
            )
        }
        scene_3.setOnClickListener {
            startActivity(
                Intent(this, TinderScene3Activity::class.java)
            )
        }
        scene_4.setOnClickListener {
            startActivity(
                Intent(this, TinderScene4Activity::class.java)
            )
        }
        scene_5.setOnClickListener {
            startActivity(
                Intent(this, TinderScene5Activity::class.java)
            )
        }
        scene_6.setOnClickListener {
            startActivity(
                Intent(this, TinderScene6Activity::class.java)
            )
        }
        scene_7.setOnClickListener {
            startActivity(
                Intent(this, TinderScene7Activity::class.java)
            )
        }
        scene_8.setOnClickListener {
            startActivity(
                Intent(this, TinderScene8Activity::class.java)
            )
        }
        scene_9.setOnClickListener {
            startActivity(
                Intent(this, TinderScene9Activity::class.java)
            )
        }
        scene_10.setOnClickListener {
            startActivity(
                Intent(this, TinderScene10Activity::class.java)
            )
        }
        rotationCard.setOnClickListener {
            startActivity(
                Intent(this, RotationCardActivity::class.java)
            )
        }
    }
}

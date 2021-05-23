package com.auth.toasterexample

import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.auth.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var lay :LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.hello)
       btn.setOnClickListener {
       }
    }
}
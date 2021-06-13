package com.sankalp.textcolor_onbuttonclick

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var text3: TextView
    lateinit var text4: TextView
    lateinit var text5: TextView
    lateinit var text6: TextView
    lateinit var text7: TextView
    lateinit var text8: TextView
    lateinit var text9: TextView
    lateinit var text0: TextView

    lateinit var btn_1: Button
    lateinit var btn_2: Button
    lateinit var btn_3: Button
    lateinit var btn_4: Button
    lateinit var btn_5: Button
    lateinit var btn_6: Button
    lateinit var btn_7: Button
    lateinit var btn_8: Button
    lateinit var btn_9: Button
    lateinit var btn_0: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1 = findViewById(R.id.tv_1)
        text2 = findViewById(R.id.tv_2)
        text3 = findViewById(R.id.tv_3)
        text4 = findViewById(R.id.tv_4)
        text5 = findViewById(R.id.tv_5)
        text6 = findViewById(R.id.tv_6)
        text7 = findViewById(R.id.tv_7)
        text8 = findViewById(R.id.tv_8)
        text9 = findViewById(R.id.tv_9)
        text0 = findViewById(R.id.tv_0)

        btn_1 = findViewById(R.id.button1)
        btn_2 = findViewById(R.id.button2)
        btn_3 = findViewById(R.id.button3)
        btn_4 = findViewById(R.id.button4)
        btn_5 = findViewById(R.id.button5)
        btn_6 = findViewById(R.id.button6)
        btn_7 = findViewById(R.id.button7)
        btn_8 = findViewById(R.id.button8)
        btn_9 = findViewById(R.id.button9)
        btn_0 = findViewById(R.id.button0)

        setListeners()

    }
        private fun setListeners(){
            val clickableViews: List<View> =
                listOf(text1, text2, text3, text4, text5, text6, text7, text8, text9, text0,
                       btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0)
            for (item in clickableViews){
                item.setOnClickListener { makeColoured(it) }
            }
        }
        private fun makeColoured(view: View){
            when(view.id){

                 R.id.tv_1 -> view.setBackgroundColor(Color.DKGRAY)
                 R.id.tv_2 -> view.setBackgroundColor(Color.GRAY)
                 R.id.tv_3 -> view.setBackgroundColor(Color.DKGRAY)
                 R.id.tv_4 -> view.setBackgroundColor(Color.GRAY)

                 R.id.tv_5 -> view.setBackgroundResource(android.R.color.holo_green_light)
                 R.id.tv_6 -> view.setBackgroundResource(android.R.color.holo_green_dark)
                 R.id.tv_7 -> view.setBackgroundResource(android.R.color.holo_green_light)
                 R.id.tv_8 -> view.setBackgroundResource(android.R.color.holo_green_dark)

                 R.id.tv_9 -> view.setBackgroundResource(android.R.color.holo_green_dark)
                 R.id.tv_0 -> view.setBackgroundResource(android.R.color.holo_green_light)

                 R.id.button1 -> text1.setBackgroundResource(R.color.my_red)
                 R.id.button2 -> text2.setBackgroundResource(R.color.my_green)
                 R.id.button3 -> text3.setBackgroundResource(R.color.my_yellow)
                 R.id.button4 -> text4.setBackgroundResource(R.color.my_red)
                 R.id.button5 -> text5.setBackgroundResource(R.color.my_green)
                 R.id.button6 -> text6.setBackgroundResource(R.color.my_yellow)
                 R.id.button7 -> text7.setBackgroundResource(R.color.my_red)
                 R.id.button8 -> text8.setBackgroundResource(R.color.my_green)
                 R.id.button9 -> text9.setBackgroundResource(R.color.my_yellow)
                 R.id.button0 -> text0.setBackgroundResource(R.color.my_green)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
}
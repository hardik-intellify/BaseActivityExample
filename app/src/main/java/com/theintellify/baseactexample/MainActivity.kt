package com.theintellify.baseactexample

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText.setOnFocusChangeListener { v, hasFocus ->
            if (!hasFocus) {
                log(message = "Keyboard should be hidden now!")
                hideKeyboard(v)
            }
        }

        button.setOnClickListener {
            startActivity(Intent(this@MainActivity, SecActivity::class.java))
        }
    }
}

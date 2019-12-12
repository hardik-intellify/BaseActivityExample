package com.theintellify.baseactexample

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sec.*

class SecActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        editText2.setOnFocusChangeListener { v, hasFocus ->
            if (!hasFocus) {
                log(message = "Keyboard should be hidden now!")
                hideKeyboard(v)
            }
        }
    }
}

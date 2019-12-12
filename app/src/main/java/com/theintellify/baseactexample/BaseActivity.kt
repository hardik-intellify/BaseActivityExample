package com.theintellify.baseactexample

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity


/**
 * @author {Hardik B. Mahant}
 * crated on 12/12/2019
 */
@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    private val tag: String = "Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(tag, "inside onCreate()")
    }

    fun hideKeyboard(v: View) {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(v.windowToken, 0)
        log(message = "Hiding...")
    }

    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
    }

    override fun finish() {
        super.finish()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
        log(message = "inside onFinish()")
    }

    fun log(TAG: String = "TAG", message: String = "") {
        Log.d(TAG, message)
    }

}
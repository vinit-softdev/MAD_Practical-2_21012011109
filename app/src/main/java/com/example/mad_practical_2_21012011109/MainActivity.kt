package com.example.mad_practical_2_21012011109

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is calles")
    }
    fun showMessage(Mess:String){
        Log.i(TAG, Mess)
        Toast.makeText(this, Mess, Toast.LENGTH_SHORT).show()
        val v= findViewById<View>(R.id.myCoordinatorLayout)
        if(v!=null){
            Snackbar.make(
                v,
                Mess,
                Snackbar.LENGTH_SHORT
            )
        }

    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestory method is called")
    }
}
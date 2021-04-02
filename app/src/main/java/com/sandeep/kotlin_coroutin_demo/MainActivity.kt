package com.sandeep.kotlin_coroutin_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch{

           // delay(3000L)
            //Log.d(TAG,"Coroutine says hello from thread ${Thread.currentThread().name}")

           val networkCallAnswer= networkCall()
            val networkCallAnswer2= networkCall2()

            Log.d(TAG,networkCallAnswer)
            Log.d(TAG,networkCallAnswer2)
        }

       // Log.d(TAG,"Hello from thread ${Thread.currentThread().name}")

    }

    suspend fun networkCall() :String{

        delay(3000L)
        return "This is the answer 1"
    }
    suspend fun networkCall2() :String{

        delay(3000L)
       return  "This is the answer 2"
    }
}
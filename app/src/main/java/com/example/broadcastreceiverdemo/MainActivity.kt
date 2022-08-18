package com.example.broadcastreceiverdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image= findViewById<ImageView>(R.id.image)

        var intent: Intent = intent
        var action = intent.action
        var type= intent.type

        if (Intent.ACTION_SEND.equals(action) && type!=null){
            image.setImageURI(intent.getParcelableExtra(Intent.EXTRA_STREAM))
        }

    }
}
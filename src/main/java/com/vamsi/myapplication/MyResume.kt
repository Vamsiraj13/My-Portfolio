package com.vamsi.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_my_resume.*

class MyResume : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_resume)

        pdf.setOnClickListener{
            val intent = Intent(
                Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1EVTVmNbWopdnqO_I5r9V2ShnK0tQvU-X/view?usp=sharing"
            ))
            startActivity(intent)
        }
        depart.setOnClickListener{
            finish()
        }
    }
}
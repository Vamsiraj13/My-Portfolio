package com.vamsi.myapplication

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //3 methods to open urls
        instagram.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vamsi_raj___/"))
            startActivity(intent)
        }
        /*btn.setOnClickListener{
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            startActivity(intent)
        }*/
        /*val yt = findViewById<ImageView>(R.id.youtube)
        yt.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC6tyjydR6uKuYAFyXf8f6WQ"
            ))
            startActivity(intent)
        }*/
        /*val fb = findViewById<ImageView>(R.id.facebook)
        fb.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vamsi.raj.5015/"
            ))
            startActivity(intent)
        }*/
        /*val insta = findViewById<ImageView>(R.id.instagram)
        insta.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vamsi_raj___/"
            ))
            startActivity(intent)
        }*/
        /*val linkedin = findViewById<ImageView>(R.id.Linkedin)
        linkedin.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vamsi-doraswamy-7a84a6218//"
            ))
            startActivity(intent)
        }*/
        /*val tweet = findViewById<ImageView>(R.id.Twitter)
        tweet.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Vamsira79950459"
            ))
            startActivity(intent)
        }*/
        /*val share = findViewById<ImageView>(R.id.share)
        share.setOnClickListener(){
            Toast.makeText(this, "Not available yet", Toast.LENGTH_LONG).show()
        }*/

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater.inflate(R.menu.new_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.resume ->{
                val intent = Intent(this, MyResume::class.java)
                startActivity(intent)
            }
            R.id.exit ->{
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun fb(view: View) {val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/vamsi.raj.5015/"
    ))
        startActivity(intent)}
    /*fun insta(view: View){val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/vamsi_raj___/"
    ))
        startActivity(intent)}*/
    fun tweet(view: View){val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Vamsira79950459"
    ))
        startActivity(intent)}
    fun yt(view: View){val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC6tyjydR6uKuYAFyXf8f6WQ"
    ))
        startActivity(intent)}
    fun linkedin(view: View){val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vamsi-doraswamy-7a84a6218//"
    ))
        startActivity(intent)}
    fun share(view: View){Toast.makeText(this, "Not available yet", Toast.LENGTH_LONG).show()}


}
package com.tmdhoon.todolist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.tmdhoon.todolist.databinding.ActivitySplashBinding
import java.time.Duration
import javax.xml.datatype.DatatypeConstants.DURATION

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            val intent = Intent(this, LoginActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            finish()
        },DURATION)
    }
    companion object{
        private const val DURATION : Long = 1000
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

}
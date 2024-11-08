package com.example.assignment1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.assignment1.databinding.ActivityTweetCommentsBinding

class CommentActivity: AppCompatActivity() {
    companion object{
        const val USER = "john_doe"
        const val TWEET_TEXT = "lorem_ipsum_dolor_sit_amet"
        const val ALL_COMMENTS = "ağzı_olan_konuşur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val binding: ActivityTweetCommentsBinding = DataBindingUtil.setContentView(this, R.layout.activity_tweet_comments)

        val userName = intent.getStringExtra(USER)
        val tweetText = intent.getStringExtra(TWEET_TEXT)
        val allComments = intent.getStringExtra(ALL_COMMENTS)

        binding.userNameTVAc.text = userName
        binding.tweetTVAc.text = tweetText
        binding.commentTVAc.text = allComments

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
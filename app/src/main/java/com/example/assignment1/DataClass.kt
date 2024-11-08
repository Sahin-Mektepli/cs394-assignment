package com.example.assignment1

import android.content.Context

//data class DataClass(var name: String, var address: String)
data class DataClass(val context: Context){ //I learned about this from the example.
    /**
     * Does the same thing with "DataSource" in a much much worse manner. I am *not* going to improve this.
     */
    fun loadDataPoints(): List<Tweet>{
        val tweets = mutableListOf<Tweet>()

        val userList = context.resources.getStringArray(R.array.users)
        val tweetTextList = context.resources.getStringArray(R.array.tweet_array)
        val commentList = context.resources.getStringArray(R.array.comments)



        val t0comments = mutableListOf<String>(); t0comments.add(commentList[0]); t0comments.add(commentList[1]); t0comments.add(commentList[2])
        val t1comments = mutableListOf<String>(); t1comments.add(commentList[3]); t1comments.add(commentList[4]); t1comments.add(commentList[5])
        val t3comments = mutableListOf<String>(); t3comments.add(commentList[6]); t3comments.add(commentList[7]); t3comments.add(commentList[8])
        val t4comments = mutableListOf<String>(); t4comments.add(commentList[9]); t4comments.add(commentList[10]); t4comments.add(commentList[11])
        val t5comments = mutableListOf<String>(); t5comments.add(commentList[6]); t5comments.add(commentList[7]); t5comments.add(commentList[8])
        val t6comments = mutableListOf<String>(); t6comments.add(commentList[9]); t6comments.add(commentList[10]); t6comments.add(commentList[11])

        tweets.add(Tweet(user = userList[0], tweetText = tweetTextList[0], comments = t0comments))
        tweets.add(Tweet(user = userList[0], tweetText = tweetTextList[1], comments = t1comments))
        tweets.add(Tweet(user = userList[0], tweetText = tweetTextList[2], comments = t3comments))
        tweets.add(Tweet(user = userList[1], tweetText = tweetTextList[3], comments = t4comments))
        tweets.add(Tweet(user = userList[2], tweetText = tweetTextList[4], comments = t5comments))
        tweets.add(Tweet(user = userList[2], tweetText = tweetTextList[5], comments = t6comments))
        tweets.add(Tweet(user = userList[1], tweetText = tweetTextList[3], comments = t4comments))
        tweets.add(Tweet(user = userList[0], tweetText = tweetTextList[2], comments = t3comments))
        tweets.add(Tweet(user = userList[1], tweetText = tweetTextList[2], comments = t0comments))
        return tweets
    }

}


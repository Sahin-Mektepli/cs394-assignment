package com.example.assignment1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class ItemAdapter(private val data: List<Tweet>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        private lateinit var tweet: Tweet

        val tweetView: TextView = view.findViewById(R.id.tweetTV)
        val commentView: TextView = view.findViewById(R.id.commentTV)
        init {

            view.setOnClickListener{
                val context = itemView.context
                val showUserIntent = Intent(context, CommentActivity::class.java)

                showUserIntent.putExtra(CommentActivity.USER, tweet.user)
                showUserIntent.putExtra(CommentActivity.TWEET_TEXT, tweet.tweetText)
                var allComments:String = "sdfg"
                for(comment in tweet.comments){
                    allComments += comment + "\n"
                }
                showUserIntent.putExtra(CommentActivity.ALL_COMMENTS, allComments)
                context.startActivity(showUserIntent)
            }
        }
        fun bind(tweet: Tweet){
            this.tweet = tweet
            tweetView.text = tweet.tweetText
                        //var allComments: String = ""
                        //for(i in tweet.comments.indices){ this shows all the comments right away.
                        //    allComments += tweet.comments[i] + "\n"
                        //}
            val topComment: String = tweet.comments[0]
            commentView.text = "**TOP COMMENT** ==> "+topComment
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder { //not much to innovate on...
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val tweet = data[position]
        holder.bind(tweet)
    }


}
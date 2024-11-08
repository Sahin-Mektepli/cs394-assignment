package com.example.assignment1

import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var text1List: Array<String>
    lateinit var text2List: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainM)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val tweets = DataClass(this).loadDataPoints()

        //***** my initial text set, hehe:
        //text1List = arrayOf("lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü")
        //text2List = arrayOf("lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü","lala","lolo", "lülü")

        recyclerView = findViewById(R.id.rv)

        recyclerView.adapter = ItemAdapter(tweets)
        //recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)


        //dataList = arrayListOf<DataClass>()
        //getData()
    }

    /**


    fun getData(){
        for(i in text1List.indices){
            val dataClass = DataClass(text1List[i], text2List[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }*/
}
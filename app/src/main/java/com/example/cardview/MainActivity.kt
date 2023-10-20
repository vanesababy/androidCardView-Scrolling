package com.example.cardview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.adapter.RecycleViewAdapter
import com.example.cardview.data.DataSourse


class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView
    private lateinit var dataSourse: DataSourse




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataSet=DataSourse().loatAffirmation()
        val recyclerView=findViewById<RecyclerView>(R.id.idCourseRV)


        val layoutManager =GridLayoutManager(this, 2)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter =RecycleViewAdapter (this, myDataSet)
        recyclerView.setHasFixedSize(true)


    }
}
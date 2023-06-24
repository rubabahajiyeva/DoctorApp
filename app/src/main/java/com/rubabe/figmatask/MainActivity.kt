package com.rubabe.figmatask

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rubabe.figmatask.adapter.TopDoctorsAdapter
import com.rubabe.figmatask.databinding.ActivityMainBinding
import com.rubabe.figmatask.model.TopDoctorsModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var list = mutableListOf<TopDoctorsModel>(
        TopDoctorsModel(
            R.drawable.dr_image,
            "dr. Gilang Segara Bening",
            "Heart",
            "Persahabatan Hospital",
          "(1221)", "Open"
        ),
        TopDoctorsModel(
            R.drawable.dr_image,
            "dr. Gilang Segara Bening",
            "Heart",
            "Persahabatan Hospital",
            "(1221)", "Open"
        ),
        TopDoctorsModel(
            R.drawable.dr_image,
            "dr. Gilang Segara Bening",
            "Heart",
            "Persahabatan Hospital",
            "(1221)", "Close"
        ),

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter = TopDoctorsAdapter(this,list)
    }
}
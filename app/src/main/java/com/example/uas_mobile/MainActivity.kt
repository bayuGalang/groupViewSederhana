package com.example.uas_mobile

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btngo1 : Button = findViewById(R.id.btn_go1)
        btngo1.setOnClickListener(this)
        val btngo2 : Button = findViewById(R.id.btn_go2)
        btngo2.setOnClickListener(this)
        val btngo3 : Button = findViewById(R.id.btn_go3)
        btngo3.setOnClickListener(this)
        val btncn4 : Button = findViewById(R.id.btn_cnt)
        btncn4.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id)
        {
            R.id.btn_go1 -> {
                val pindah = Intent(this@MainActivity, Paket::class.java)
                startActivity(pindah)
            }
            R.id.btn_go2 -> {
                val pindah2 = Intent(this@MainActivity, paket1::class.java)
                startActivity(pindah2)
            }
            R.id.btn_go3 -> {
                val pindah3 = Intent(this@MainActivity, Paket2::class.java)
                startActivity(pindah3)
            }
            R.id.btn_cnt -> {
                val nomor = "081240741190"
                val call = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$nomor"))
                startActivity(call)
            }
        }
    }
}
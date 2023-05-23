package com.example.assignment1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnCallUs= findViewById<Button>(R.id.btnCallUs)
        val cardAndroidD= findViewById<CardView>(R.id.cardAndroidDev)
        val cardWebD= findViewById<CardView>(R.id.cardWebDev)
        val cardIosD= findViewById<CardView>(R.id.cardIosDev)
        val cardAi= findViewById<CardView>(R.id.cardAiMl)
        val cardBlockChain = findViewById<CardView>(R.id.cardBlcokchain)
        val cardDevOp= findViewById<CardView>(R.id.cardDevops)
        val dummy="1234567890"
        cardAndroidD.setOnClickListener{
            val intent = Intent(this,AndroidDevelopment::class.java)
            startActivity(intent)
        }
        cardWebD.setOnClickListener{
            val intent = Intent(this,WebDevelopment::class.java)
            startActivity(intent)
        }
        cardIosD.setOnClickListener{
            val intent = Intent(this,IosDevelopment::class.java)
            startActivity(intent)
        }
        cardAi.setOnClickListener{
            val intent = Intent(this,AiMl::class.java)
            startActivity(intent)
        }
        cardBlockChain.setOnClickListener{
            val intent = Intent(this,Blockchain::class.java)
            startActivity(intent)
        }
        cardDevOp.setOnClickListener{
            val intent = Intent(this,DevOps::class.java)
            startActivity(intent)
        }
        btnCallUs.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$dummy")
            startActivity(intent)
        }

    }
}
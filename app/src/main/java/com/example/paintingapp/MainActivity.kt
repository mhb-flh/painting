package com.example.paintingapp

import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.paintingapp.PaintView.Companion.colorList
import com.example.paintingapp.PaintView.Companion.currentBrush
import com.example.paintingapp.PaintView.Companion.pathList
import com.example.paintingapp.databinding.ActivityMainBinding

private lateinit var binding:ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object{
        var path=Path()
        var paintBrush=Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.btnBlack.setOnClickListener{
            paintBrush.color = resources.getColor(R.color.black)
            currentColor(paintBrush.color)
        }
        binding.btnBlue.setOnClickListener{
            paintBrush.color = resources.getColor(R.color.blue)
            currentColor(paintBrush.color)
        }
        binding.btnGreen.setOnClickListener{
            paintBrush.color = resources.getColor(R.color.green)
            currentColor(paintBrush.color)
        }
        binding.btnRed.setOnClickListener{
            paintBrush.color = resources.getColor(R.color.Red)
            currentColor(paintBrush.color)
        }
        binding.eraser.setOnClickListener{
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color :Int){
        currentBrush=color
        path=Path()
    }
}
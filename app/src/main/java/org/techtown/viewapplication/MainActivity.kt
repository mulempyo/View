package org.techtown.viewapplication

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.techtown.viewapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val customView = CustomView("안녕 코틀린!",this)
        binding.frameLayout.addView(customView)
    }
}

class CustomView(text : String , context : Context): View(context){
    val text : String
    init{
        this.text=text
    }
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        
        val paint = Paint()
        paint.color = Color.BLACK
        paint.textSize = 100f
        canvas?.drawText(text,100f,300f,paint) //drawText메서드,텍스트를 출력하기 위해 Canvas의 drawText()메서드 사용

    }

}
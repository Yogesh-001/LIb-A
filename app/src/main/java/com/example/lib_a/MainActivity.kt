package com.example.lib_a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultPlus:Int=calculate.plus(a = 10,b=20)
        var resultMinus:Int=calculate.minus(a = 10,b=5)
        var resultDivide:Int=calculate.divide(a = 212,b = 231)
        var resultProduct:Int=calculate.product(a = 114,b = 2156)

        btnplus.setOnClickListener{
            Toast.makeText(this,resultPlus.toString(),Toast.LENGTH_LONG).show()
        }
        btnminus.setOnClickListener{
            Toast.makeText(this,resultMinus.toString(),Toast.LENGTH_LONG).show()
        }
        btnproduct.setOnClickListener{
            Toast.makeText(this,resultProduct.toString(),Toast.LENGTH_LONG).show()
        }
        btndivide.setOnClickListener{
            Toast.makeText(this,resultDivide.toString(),Toast.LENGTH_LONG).show()
        }


    }
}
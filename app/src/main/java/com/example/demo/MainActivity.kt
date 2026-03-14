package com.example.demo

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/**
 * CheckBox 演示 Activity
 * 展示如何在 Android 中使用复选框
 */
class MainActivity : AppCompatActivity() {

    private lateinit var checkBox1: CheckBox
    private lateinit var checkBox2: CheckBox
    private lateinit var checkBox3: CheckBox
    private lateinit var button: Button
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化组件
        checkBox1 = findViewById(R.id.checkBox1)
        checkBox2 = findViewById(R.id.checkBox2)
        checkBox3 = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        // 设置按钮点击监听器
        button.setOnClickListener {
            // 获取所有复选框的状态
            val builder = StringBuilder("你选择了: ")

            if (checkBox1.isChecked) {
                builder.append("苹果 ")
            }
            if (checkBox2.isChecked) {
                builder.append("香蕉 ")
            }
            if (checkBox3.isChecked) {
                builder.append("橙子 ")
            }

            if (builder.toString() == "你选择了: ") {
                Toast.makeText(this, "请至少选择一个", Toast.LENGTH_SHORT).show()
            } else {
                textView.text = builder.toString()
            }
        }
    }
}

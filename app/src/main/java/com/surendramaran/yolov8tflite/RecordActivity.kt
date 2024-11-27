package com.surendramaran.yolov8tflite

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import yolov8tflite.R

class RecordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record)

        val problemField = findViewById<EditText>(R.id.etProblem)
        val phoneField = findViewById<EditText>(R.id.etPhone)
        val dateField = findViewById<EditText>(R.id.etDate)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        val backButton = findViewById<Button>(R.id.btnBack)

        submitButton.setOnClickListener {
            val problem = problemField.text.toString()
            val phone = phoneField.text.toString()
            val date = dateField.text.toString()

                Toast.makeText(this, "Заявка отправлена", Toast.LENGTH_SHORT).show()
        }

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
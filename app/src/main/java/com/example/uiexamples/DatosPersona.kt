package com.example.uiexamples

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class DatosPersona : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_persona)
        var et_user_name = findViewById(R.id.et_personal_name1) as EditText
        var et_user_id = findViewById(R.id.et_user_id1) as EditText
        var et_password = findViewById(R.id.et_password1) as EditText
        var btn_reset = findViewById(R.id.btn_reset1) as Button
        var btn_submit = findViewById(R.id.btn_submit1) as Button

        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click
            et_user_id.setText("")
            et_user_name.setText("")
            et_password.setText("")
        }
    }
}
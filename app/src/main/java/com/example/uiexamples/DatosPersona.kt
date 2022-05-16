package com.example.uiexamples

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DatosPersona : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos_persona)

        var personas: Personas = Personas.instance
        var et_user_name = findViewById(R.id.et_personal_name1) as EditText
        var et_user_id = findViewById(R.id.et_user_id1) as EditText
        var et_password = findViewById(R.id.et_password1) as EditText
        var btn_reset = findViewById(R.id.btn_reset1) as Button
        var btn_submit = findViewById(R.id.btn_submit1) as Button
        var pers = Persona();
        btn_reset.setOnClickListener {
            // clearing user_name and password edit text views on reset button click

            et_user_id.setText("")
            et_user_name.setText("")
            et_password.setText("")
        }
        // set on-click listener
        btn_submit.setOnClickListener {
            val user_id =et_user_id.text
            val user_name = et_user_name.text;
            val password = et_password.text;

            //Toast.makeText(this@LoginExample, user_name, Toast.LENGTH_LONG).show()

            val bundle = intent.extras



                val editar = bundle?.getBoolean("accion") as Boolean

               if (editar){
                   pers = bundle?.getSerializable("Person1") as Persona

                   //Actualizamos o Insertamos los datos
                   pers.nombre=user_name.toString()
                   pers.user=user_id.toString()
                   pers.password=password.toString()

             }else{
                  pers =Persona(user_id.toString(),password.toString(),user_name.toString(),R.drawable.descarga)
             }

            personas.addPersona(pers)


            val i = Intent(this, CrudPersonas::class.java)
             //   i.putExtra("msg", "MENSAJE DE Login al Menú")
              //  i.putExtra("Login", Login)
//            i.putExtra("passw", password.toString())
                // start your next activity
                startActivity(i)
                // your code to validate the user_name and password combination
                // and verify the same


        }

    }




}
package com.tlcabrera.ejemplologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUpActivity: AppCompatActivity(){
    //logica de la funcion
    /*
    *
    *
    *
    * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
        val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
        val signUpButton = findViewById<Button>(R.id.buttonSignUp)
        signUpButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()
            //logica de conexion con la BD
            finish()
        }



    }

}
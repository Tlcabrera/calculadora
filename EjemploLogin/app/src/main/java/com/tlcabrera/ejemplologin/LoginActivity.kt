package com.tlcabrera.ejemplologin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class LoginActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_sign_up)
    val usernameEditText = findViewById<EditText>(R.id.editTextUsername)
    val passwordEditText = findViewById<EditText>(R.id.editTextPassword)
    val signUpButton = findViewById<Button>(R.id.buttonSignUp)
    signUpButton.setOnClickListener {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()
        //logica de conexion validación con la base de datos
        finish()
    }



}

}
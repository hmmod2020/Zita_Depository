package com.zita.zitadb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        var intet=Intent(this,mainScreen::class.java)
        val loginBtn=findViewById<Button>(R.id.loginBtn)
        val uesrName=findViewById<EditText>(R.id.userName)
        val password=findViewById<EditText>(R.id.password)
        val editTextuserNameAtt=findViewById<TextInputLayout>(R.id.userNameEditAttripute)
        val editTextuserpasswordAtt=findViewById<TextInputLayout>(R.id.PasswordEditAttripute)
        loginBtn.setOnClickListener {
           if(uesrName.text.isNotEmpty()){
               editTextuserNameAtt.isErrorEnabled=false

           }else {
               Toast.makeText(this,"enter a valid username",Toast.LENGTH_LONG).show()
           }
            if(password.text.isNotEmpty()){
                editTextuserpasswordAtt.isErrorEnabled=false

            }else {
                Toast.makeText(this,"enter a valid password",Toast.LENGTH_LONG).show()
            }
            if (uesrName.text.isNotEmpty()&&password.text.isNotEmpty()){

                startActivity(intet)
                finish()

            }

        }
    }
}
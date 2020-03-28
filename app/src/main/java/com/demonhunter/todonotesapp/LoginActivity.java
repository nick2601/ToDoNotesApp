package com.demonhunter.todonotesapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    EditText fullName;
    EditText userName;
    Button btnLogin;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.logbutton);
        fullName = findViewById(R.id.fullName);
        userName = findViewById(R.id.Uname);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Funame = fullName.getText().toString();
                String U_name =userName.getText().toString();
                if(!(Funame.isEmpty() && U_name.isEmpty())){
                    Intent i = new Intent(LoginActivity.this, MyNotesActivity.class);
                    i.putExtra("full name",Funame);
                    Log.d("LoginActivity", "voila");
                    startActivity(i);
                }else {
                    Toast.makeText(LoginActivity.this,"Full name & Username cannot be empty",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}

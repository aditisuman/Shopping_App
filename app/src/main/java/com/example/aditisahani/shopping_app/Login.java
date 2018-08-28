package com.example.aditisahani.shopping_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button login;
    public String Email,Password;
        EditText email,password;
    final String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login=(Button)findViewById(R.id.login);
             email=(EditText)findViewById(R.id.email);
             password=(EditText)findViewById(R.id.passwd) ;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Email=email.getText().toString();
                Password=password.getText().toString();
                if(Email.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"enter email",Toast.LENGTH_SHORT).show();

                }
                else if(Password.length()==0)
                {
                    Toast.makeText(getApplicationContext(),"enter password",Toast.LENGTH_SHORT).show();

                }
                else if(Password.length()<6)
                {
                    Toast.makeText(getApplicationContext(),"Password must be greater than 6",Toast.LENGTH_SHORT).show();

                }
                      else if(!Email.matches(emailPattern))
                {
                    Toast.makeText(getApplicationContext(),"enter valid email",Toast.LENGTH_SHORT).show();
                }
else {
                    Intent login = new Intent(Login.this, MainApp.class);
                    startActivity(login);
                }
            }
        });
    }
}

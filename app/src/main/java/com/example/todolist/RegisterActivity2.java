package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity2 extends AppCompatActivity {

    Button register_btn;
    private Button CreateAccountButton;
    private EditText InputName, InputPhoneNumber, InputPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        register_btn= findViewById(R.id.register_btn);

        CreateAccountButton= (Button) findViewById(R.id.register_btn);
        InputName= (EditText) findViewById(R.id.register_name_input);
        InputPassword= (EditText) findViewById(R.id.register_password_input);
        InputPhoneNumber= (EditText) findViewById(R.id.register_phone_number_input);

        register_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity2.this, LoginActivity2.class);
                startActivity(intent);
            }
        });


    }
}
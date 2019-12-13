package com.riskayunita.akademikunsri;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.inuser);
        password = (EditText) findViewById(R.id.inpass);
        btnLogin = (Button)findViewById(R.id.btnlgn);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("09031381722141") && passwordKey.equals("09031381722141")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "LOGIN SUKSES",
                            Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(login.this, MainActivity.class);
                    login.this.startActivity(intent);
                    finish();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username dan Password Tidak Sesuai\n                         Gagal Login",Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
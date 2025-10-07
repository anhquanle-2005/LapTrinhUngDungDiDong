package com.example.bai6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    EditText txt_email, txt_PassWord;
    Button btn_dangNhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
            txt_email = findViewById(R.id.txt_email);
            txt_PassWord = findViewById(R.id.txt_password);
            btn_dangNhap = findViewById(R.id.btn_dangnhap);

            btn_dangNhap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String email = txt_email.getText().toString().trim();
                    String pass = txt_PassWord.getText().toString().trim();
                    if(email.equals("mail@email.com") && pass.equals("1234")){
                        Intent intent = new Intent(MainActivity.this, detailActivity.class);
                        startActivity(intent);
                    }
                    else
                        Toast.makeText(MainActivity.this, "Sai password hoặc sai email", Toast.LENGTH_SHORT).show();
                }
            });

    }
}
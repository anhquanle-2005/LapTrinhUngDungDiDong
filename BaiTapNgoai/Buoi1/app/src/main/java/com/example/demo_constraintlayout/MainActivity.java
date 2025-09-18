package com.example.demo_constraintlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txt_A, txt_B, txt_Tong;
    Button btn_Tong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txt_A = findViewById(R.id.txt_A);
        txt_B = findViewById(R.id.txt_B);
        txt_Tong = findViewById(R.id.txt_Tong);

        btn_Tong = findViewById(R.id.btn_Tong);

        btn_Tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int A = Integer.parseInt(txt_A.getText().toString());
                int B = Integer.parseInt(txt_B.getText().toString());

                int Tong = A + B;
                txt_Tong.setText(Tong+"");
            }
        });
    }
}
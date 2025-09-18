package com.example.demo_tablelayout;

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
    EditText txt_NamDuongLich, txt_NamAmLich;
    Button btn_Chuyen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        txt_NamAmLich = findViewById(R.id.txt_NamAmLich);
        txt_NamDuongLich = findViewById(R.id.txt_NamDuongLich);
        btn_Chuyen = findViewById(R.id.btn_ChuyenDoi);
        btn_Chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String can = "", chi = "";
                int namDuong = Integer.parseInt(txt_NamDuongLich.getText().toString());

                switch (namDuong % 10)
                {
                    case 0: can = "Camh";break;
                    case 1: can = "Tân";break;
                    case 2: can = "Nhâm";break;
                    case 3: can = "Quý";break;
                    case 4: can = "Giáp";break;
                    case 5: can = "Ất";break;
                    case 6: can = "Bính";break;
                    case 7: can = "Đinh";break;
                    case 8: can = "Mậu";break;
                    case 9: can = "Ký";break;
                }

                switch (namDuong % 12)
                {
                    case 0: chi= "Thân"; break;
                    case 1: chi= "Dậu"; break;
                    case 2: chi= "Tuất"; break;
                    case 3: chi= "Hợi"; break;
                    case 4: chi= "Tý"; break;
                    case 5: chi= "Sửu"; break;
                    case 6: chi= "Dầb"; break;
                    case 7: chi= "Mẹo"; break;
                    case 8: chi= "Thìn"; break;
                    case 9: chi= "Ty"; break;
                    case 10: chi= "Ngọ"; break;
                    case 11: chi= "Mùi"; break;
                }

                txt_NamAmLich.setText(can + " " +chi);
            }
        });
    }
}
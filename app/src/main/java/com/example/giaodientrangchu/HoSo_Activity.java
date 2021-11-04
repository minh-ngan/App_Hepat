package com.example.giaodientrangchu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class HoSo_Activity extends AppCompatActivity {
    ImageButton imbtnHomePage,imbtnLichKham,imbtnThongBao,imbtnTaiKhoan,imbtnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ho_so);
        linkView();
        addEvents();
    }

    private void addEvents() {
        imbtnLichKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HoSo_Activity.this,LichKham.class);
                startActivity(intent);
            }
        });
        imbtnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HoSo_Activity.this,ThongBao_Activity.class);
                startActivity(intent);
            }
        });
        imbtnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HoSo_Activity.this,TrangUser.class);
                startActivity(intent);
            }
        });
        imbtnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HoSo_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HoSo_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkView() {
        imbtnHomePage=findViewById(R.id.imbtnHomePage);
        imbtnLichKham=findViewById(R.id.imbtnLichKham);
        imbtnThongBao=findViewById(R.id.imbtnThongBao);
        imbtnTaiKhoan=findViewById(R.id.imbtnTaikhoan);
        imbtnBack=findViewById(R.id.imbtnBackHoso);
    }
}
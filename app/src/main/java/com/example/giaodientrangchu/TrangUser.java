package com.example.giaodientrangchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class TrangUser extends AppCompatActivity {
    ImageButton imbtnHomePage,imbtnLichKham,imbtnThongBao,imbtnTaiKhoan ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_user);

        linkView();
        addEvents();
    }

    private void addEvents() {
        imbtnLichKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TrangUser.this,LichKham.class);
                startActivity(intent);
            }
        });
        imbtnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TrangUser.this,ThongBao_Activity.class);
                startActivity(intent);
            }
        });

        imbtnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TrangUser.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkView() {
        imbtnHomePage=findViewById(R.id.imbtnHomePage);
        imbtnLichKham=findViewById(R.id.imbtnLichKham);
        imbtnThongBao=findViewById(R.id.imbtnThongBao);
        imbtnTaiKhoan=findViewById(R.id.imbtnTaikhoan);

    }
}
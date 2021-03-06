package com.example.giaodientrangchu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.model.BenhVien;
import com.example.adapter.AdapterBV;

import java.util.ArrayList;

public class Booking_Activity extends AppCompatActivity {
    ImageView imvShapeGreen,imbtnHomePage,imbtnLichKham,imbtnThongBao,imbtnTaiKhoan,imbtnBack;;
    TextView txtListBV;
    ListView lvBV;
    ArrayList<BenhVien> arrayList;
    AdapterBV adapterBV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        linkView();
        loadData();
        addEvents();


    }

    private void addEvents() {
        imbtnLichKham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Booking_Activity.this,LichKham.class);
                startActivity(intent);
            }
        });
        imbtnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Booking_Activity.this,ThongBao_Activity.class);
                startActivity(intent);
            }
        });
        imbtnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Booking_Activity.this,TrangUser.class);
                startActivity(intent);
            }
        });
        imbtnHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Booking_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        imbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Booking_Activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void linkView() {
        lvBV=findViewById(R.id.lvBV);
        imvShapeGreen=findViewById(R.id.imvShapeGreen);
        txtListBV=findViewById(R.id.txtListBV);
        imbtnHomePage=findViewById(R.id.imbtnHomePage);
        imbtnLichKham=findViewById(R.id.imbtnLichKham);
        imbtnThongBao=findViewById(R.id.imbtnThongBao);
        imbtnTaiKhoan=findViewById(R.id.imbtnTaikhoan);
        imbtnBack=findViewById(R.id.imbtnBachDatLich);
    }

    private void loadData() {

        arrayList = new ArrayList<>();

        arrayList.add(new BenhVien(R.drawable.bv_tudu, "B???nh vi???n T??? D??", "284, C???ng Qu???nh, Ph???m Ng?? L??o, Q.1,HCM"));
        arrayList.add(new BenhVien(R.drawable.bv_choray, "B???nh vi???n Ch??? R???y", "21B,Nguy???n Ch?? Thanh, P.12, Q.5,HCM"));
        arrayList.add(new BenhVien(R.drawable.bv_yduoc, "B???nh vi???n Y D?????c", "201,Nguy???n Ch?? Thanh, P.12, Q.5,HCM"));
        adapterBV = new AdapterBV(Booking_Activity.this, R.layout.item_list_bv, arrayList);
        lvBV.setAdapter(adapterBV);
    }}

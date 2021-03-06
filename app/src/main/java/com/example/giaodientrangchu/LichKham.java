package com.example.giaodientrangchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;


import com.example.adapter.LichKhamAdapter;
import com.example.model.LichKhamht;

import java.util.ArrayList;

public class LichKham extends AppCompatActivity {
    ListView lvLichkhamht;
    ArrayList<LichKhamht> lichKhamhts;
    LichKhamAdapter adapter;
    ImageButton imbtnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_kham);
        
        linkView();
        loadTab();
        initData();
        loadData();
        addEvents();


    }

    private void addEvents() {
        imbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LichKham.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void loadTab() {
        final TabHost tab=findViewById(android.R.id.tabhost);
        tab.setup();
        TabHost.TabSpec spec;
        spec=tab.newTabSpec("t1");
        spec.setContent(R.id.tab_1);
        spec.setIndicator("Hiện tại");
        tab.addTab(spec);
        spec=tab.newTabSpec("t2");
        spec.setContent(R.id.tab_2);
        spec.setIndicator("Đã hoàn thành");
        tab.addTab(spec);
        spec=tab.newTabSpec("t3");
        spec.setContent(R.id.tab_3);
        spec.setIndicator("Đã hủy");
        tab.addTab(spec);
        tab.setCurrentTab(0);
    }

    private void loadData() {
        adapter=new LichKhamAdapter(this,R.layout.list_view_lich_kham_hien_tai,lichKhamhts);
        lvLichkhamht.setAdapter(adapter);
    }

    private void initData() {
        lichKhamhts=new ArrayList<>();
        lichKhamhts.add(new LichKhamht("Bệnh viện Từ Dũ","10:00 AM","12/09/21","Đã xác nhận",R.drawable.ic_baseline_check_24));
        lichKhamhts.add(new LichKhamht("Bệnh viện Y dược","8:00 AM","12/10/21","Chưa xác nhận",R.drawable.ic_baseline_close_24));
        lichKhamhts.add(new LichKhamht("Bệnh viện Chợ Rẫy","14:00 AM","30/11/21","Đã xác nhận",R.drawable.ic_baseline_check_24));
    }


    private void linkView() {

        lvLichkhamht=findViewById(R.id.lvlichkhamht);
        imbtnBack=findViewById(R.id.imbtnBacklichkham);
    }
}
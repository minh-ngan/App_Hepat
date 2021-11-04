package com.example.giaodientrangchu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adapter.AdapterBV;
import com.example.adapter.AdapterTrieuChung;
import com.example.model.BenhVien;
import com.example.model.TrieuChung;

import java.util.ArrayList;

public class activity_tu_van extends AppCompatActivity {
   ImageButton imbtnBack;
   ListView lvTC;
   ArrayList<TrieuChung> arrayList;
   AdapterTrieuChung adapterTrieuChung;
   EditText edtSearch;
   ArrayAdapter<TrieuChung> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tu_van);
        linkView();
        loadData();
        addEvents();


    }

    private void addEvents() {
        imbtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity_tu_van.this,MainActivity.class);
                startActivity(intent);
            }
        });
        edtSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                activity_tu_van.this.adapter.getFilter().filter(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new TrieuChung("Buồn nôn"));
        arrayList.add(new TrieuChung("Bị đau cơ khi căng người"));
        arrayList.add(new TrieuChung("Bị choáng khi đứng lên đột ngột"));
        arrayList.add(new TrieuChung("Đau thắt ngực trái"));
        arrayList.add(new TrieuChung("Đau vùng thuợng vị"));
        arrayList.add(new TrieuChung("Choáng váng"));
        adapterTrieuChung = new AdapterTrieuChung(activity_tu_van.this,R.layout.list_trieu_chung,arrayList);
        lvTC.setAdapter(adapterTrieuChung);


    }
    private void linkView() {
        imbtnBack = findViewById(R.id.imbtnBack);
        lvTC = findViewById(R.id.lvTC);
        edtSearch = findViewById(R.id.edtSearch);
    }

}
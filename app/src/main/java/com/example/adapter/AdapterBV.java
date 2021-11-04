package com.example.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.giaodientrangchu.R;
import com.example.model.BenhVien;

import java.util.ArrayList;

public class AdapterBV extends BaseAdapter {
    Context context;
    int item_layout;
    ArrayList<BenhVien> benhViens;

    public AdapterBV(Context context, int item_layout, ArrayList<BenhVien> benhViens) {
        this.context = context;
        this.item_layout = item_layout;
        this.benhViens = benhViens;
    }

    @Override
    public int getCount() {
        return benhViens.size();
    }

    @Override
    public Object getItem(int i) {
        return benhViens.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(item_layout, null);
            holder.imvThumbBV = view.findViewById(R.id.imvThumbBV);
            holder.txtNameBV = view.findViewById(R.id.txtNameBV);
            holder.txtAddress = view.findViewById(R.id.txtAddress);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        BenhVien b = benhViens.get(i);
        holder.imvThumbBV.setImageResource(b.getThumbBV());
        holder.txtNameBV.setText(String.valueOf(b.getName()));
        holder.txtAddress.setText(String.valueOf(b.getAddress()));
        return view;
    }

    protected static class ViewHolder {
        ImageView imvThumbBV;
        TextView txtNameBV, txtAddress;
    }
}

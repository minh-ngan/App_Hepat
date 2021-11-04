package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.giaodientrangchu.LichKham;
import com.example.giaodientrangchu.R;
import com.example.model.LichKhamht;

import java.util.List;

public class LichKhamAdapter extends BaseAdapter {
    Activity context;
    int item_listview;
    List<LichKhamht> lichKhamhtList;


    public LichKhamAdapter(Activity context, int item_listview, List<LichKhamht> lichKhamhtList) {
        this.context = context;
        this.item_listview = item_listview;
        this.lichKhamhtList = lichKhamhtList;
    }

    @Override
    public int getCount() {
        return lichKhamhtList.size();
    }

    @Override
    public Object getItem(int i) {
        return lichKhamhtList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null){
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(item_listview,null);
            holder.txtName=view.findViewById(R.id.txtHospitalNameht);
            holder.txtTime=view.findViewById(R.id.txtHospitalTimeht);
            holder.txtDate=view.findViewById(R.id.txtHospitalDateht);
            holder.txtXN=view.findViewById(R.id.txtHospitalConfrirm);
            holder.imvThumb=view.findViewById(R.id.imvConfrim);
        }else {
            holder= (ViewHolder) view.getTag();

        }
        LichKhamht l=lichKhamhtList.get(i);
        holder.txtName.setText(l.getHospitalName());
        holder.txtTime.setText(l.getHospitalTime());
        holder.txtDate.setText(l.getHospitalDate());
        holder.txtXN.setText(l.getHospitalXN());
        holder.imvThumb.setImageResource(l.getHositalThumb());

        return view;
    }
    public static class ViewHolder{
        ImageView imvThumb;
        TextView txtName, txtTime,txtDate,txtXN;
    }
}

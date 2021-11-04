package com.example.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.giaodientrangchu.R;
import com.example.model.Postdiendan;

import java.util.List;

public class DiendanAdapter extends BaseAdapter {
    Activity context;
    int item_listview;
    List<Postdiendan> postdiendanList;

    public DiendanAdapter(Activity context, int item_listview, List<Postdiendan> postdiendanList) {
        this.context = context;
        this.item_listview = item_listview;
        this.postdiendanList = postdiendanList;
    }


    @Override
    public int getCount() {
        return postdiendanList.size();
    }

    @Override
    public Object getItem(int i) {
        return postdiendanList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder=null;
        if(view==null){
            holder= new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(item_listview,null);
            holder.txtUserName=view.findViewById(R.id.txtName_User);
            holder.txtUserTime=view.findViewById(R.id.txtThoiGian);
            holder.txtUserQuestion=view.findViewById(R.id.txtQuestion);

            view.setTag(holder);

        } else {
            holder= (ViewHolder) view.getTag();

        }
        Postdiendan postdiendan=postdiendanList.get(i);
        holder.txtUserName.setText(postdiendan.getUserName());
        holder.txtUserTime.setText(postdiendan.getUserTime());
        holder.txtUserQuestion.setText(postdiendan.getUserQuestion());

        return view;
    }
    public  static  class  ViewHolder{
        TextView txtUserName, txtUserTime, txtUserQuestion;
    }
}

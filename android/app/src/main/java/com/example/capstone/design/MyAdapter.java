package com.example.capstone.design;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> { //커스텀 adapter임 listview랑 비슷하지만 차이가 조금 있음 복잡함으로 여기는 잘 건드리지 않는게 좋음

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView item_Picture;
        TextView item_Title;
        TextView item_Date;

        MyViewHolder(View view){
            super(view);
            item_Picture = view.findViewById(R.id.item_picture);
            item_Title = view.findViewById(R.id.item_title);
            item_Date = view.findViewById(R.id.item_date);
        }
    }

    private ArrayList<ItemInfo> itemInfoArrayList;
    MyAdapter(ArrayList<ItemInfo> itemInfoArrayList){
        this.itemInfoArrayList = itemInfoArrayList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.item_Picture.setImageResource(itemInfoArrayList.get(position).drawableId);
        myViewHolder.item_Title.setText(itemInfoArrayList.get(position).txt1);
        myViewHolder.item_Date.setText(itemInfoArrayList.get(position).date);

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                /*Context context = v.getContext();
                Toast.makeText(context,"선택되었습니다.",Toast.LENGTH_LONG).show();*/

                Intent intent = new Intent(v.getContext(),Trade_contents.class);
                v.getContext().startActivity(intent);

            }
        });
    }


    @Override
    public int getItemCount() {
        return itemInfoArrayList.size();
    }
}

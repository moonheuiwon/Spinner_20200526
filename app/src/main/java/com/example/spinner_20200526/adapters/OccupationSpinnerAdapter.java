package com.example.spinner_20200526.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.spinner_20200526.R;
import com.example.spinner_20200526.datas.Occupation;

import java.util.List;

public class OccupationSpinnerAdapter extends ArrayAdapter {

    Context mContext;
    List<Occupation> mList;
    LayoutInflater inf;

    public OccupationSpinnerAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        mContext = context;
        mList = objects;
        inf = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.occupation_spinner_list_item, null);
        }
        ImageView iconImg = row.findViewById(R.id.iconImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

        Occupation data = mList.get(position);

        nameTxt.setText(data.getName());

        iconImg.setImageResource(data.getImageId());
        return  row;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            row = inf.inflate(R.layout.occupation_spinner_list_item, null);
        }
        ImageView iconImg = row.findViewById(R.id.iconImg);
        TextView nameTxt = row.findViewById(R.id.nameTxt);

        Occupation data = mList.get(position);

        nameTxt.setText(data.getName());

        iconImg.setImageResource(data.getImageId());
        return  row;
    }
}

package com.example.elkingabomaher.sohagtourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends ArrayAdapter {
    public ListAdapter(@NonNull Context context, ArrayList<List> list) {
        super(context, 0, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        List list = (List) getItem(position);
        TextView name = (TextView) view.findViewById(R.id.name_list_item);
        name.setText(list.gettName());

        TextView det = (TextView) view.findViewById(R.id.det_list_item);
        det.setText(list.gettDetails());

        ImageView imageView = (ImageView)view.findViewById(R.id.image_list_item);
        imageView.setImageResource(list.gettImage());
        return view;
    }
}

package com.example.elkingabomaher.sohagtourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ResFragment extends Fragment {
    View view ;
    ArrayList<List> arrayList;
    ListView listView;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.res_fragment,container,false);
        listView = (ListView)view.findViewById(R.id.list_view_res);
        arrayList = new ArrayList<List>();
        ListAdapter listAdapter = new ListAdapter(getActivity().getApplicationContext(),arrayList);
        arrayList.add(new List(R.drawable.moamen,getResources().getString(R.string.res_name_1),getResources().getString(R.string.res_det_1)));
        arrayList.add(new List(R.drawable.alnile_hotel,getResources().getString(R.string.res_name_2),getResources().getString(R.string.res_det_2)));

        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity().getApplicationContext(), List_View.class);
                Bundle b = new Bundle();
                b.putInt("image",arrayList.get(i).gettImage());
                b.putString("name",arrayList.get(i).gettName());
                b.putString("det",arrayList.get(i).gettDetails());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        return view;
    }
}

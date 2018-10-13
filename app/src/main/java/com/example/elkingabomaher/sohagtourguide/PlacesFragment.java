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

public class PlacesFragment extends Fragment {
    View view;
    ArrayList<List> arrayList;
    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.places_fragment,container,false);
        listView = (ListView)view.findViewById(R.id.list_view_places);
        arrayList = new ArrayList<List>();
        ListAdapter listAdapter = new ListAdapter(getActivity().getApplicationContext(),arrayList);
        arrayList.add(new List(R.drawable.abydos_city,getResources().getString(R.string.place_name_1),getResources().getString(R.string.place_det_1)));
        arrayList.add(new List(R.drawable.sidi_arif_mosque,getResources().getString(R.string.place_name_2),getResources().getString(R.string.place_det_2)));
        arrayList.add(new List(R.drawable.sohagfarschutiinside,getResources().getString(R.string.place_name_3),getResources().getString(R.string.place_det_3)));
        arrayList.add(new List(R.drawable.sohagvirgininside,getResources().getString(R.string.place_name_4),getResources().getString(R.string.place_det_4)));
        arrayList.add(new List(R.drawable.whitemonasterysouthside,getResources().getString(R.string.place_name_5),getResources().getString(R.string.place_det_5)));
        arrayList.add(new List(R.drawable.redmonasteryoutside,getResources().getString(R.string.place_name_6),getResources().getString(R.string.place_det_6)));

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

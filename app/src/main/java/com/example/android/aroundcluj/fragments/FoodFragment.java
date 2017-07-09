package com.example.android.aroundcluj.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.aroundcluj.Location;
import com.example.android.aroundcluj.R;
import com.example.android.aroundcluj.adapters.LocationAdapter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.location_list, container, false);
        ListView listView = (ListView) root.findViewById(R.id.list);
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.food1, R.string.food1_address,4));
        locations.add(new Location(R.string.food2, R.string.food2_address,4));
        locations.add(new Location(R.string.food3, R.string.food3_address,4));

        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        listView.setAdapter(adapter);

        return root;
    }

}

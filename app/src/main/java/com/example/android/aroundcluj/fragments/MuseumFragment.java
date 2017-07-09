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
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {

    public MuseumFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.location_list, container, false);

        List<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.museum1, R.string.museum1_address, 4, R.string.museum1_description, R.drawable.history_museum));
        locations.add(new Location(R.string.museum2, R.string.museum2_address, 4, R.string.museum2_description, R.drawable.zoological_museum));
        locations.add(new Location(R.string.museum3, R.string.museum3_address, 4, R.string.museum3_description, R.drawable.banffy_palace));

        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) root.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return root;
    }
}

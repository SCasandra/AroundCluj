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
public class ParkFragment extends Fragment {

    public ParkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.location_list, container, false);

        List<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.parc1, R.string.parc1_address, 5, R.string.parc1_description));
        locations.add(new Location(R.string.parc2, R.string.parc2_address, 2, R.string.parc2_description));
        locations.add(new Location(R.string.parc3, R.string.parc3_address, 3));
        locations.add(new Location(R.string.parc4, R.string.parc4_address, 5));
        locations.add(new Location(R.string.parc5, R.string.parc5_address, 3));
        LocationAdapter adapter = new LocationAdapter(getContext(), locations);
        ListView listView = (ListView) root.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return root;
    }
}

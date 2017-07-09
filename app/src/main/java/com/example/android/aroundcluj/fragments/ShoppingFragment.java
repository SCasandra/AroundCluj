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
public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.location_list, container, false);

        List<Location> shops = new ArrayList<>();
        shops.add(new Location(R.string.shop1, R.string.shop1_address, 4));
        shops.add(new Location(R.string.shop2, R.string.shop2_address, 3));
        shops.add(new Location(R.string.shop3, R.string.shop3_address, 5));

        LocationAdapter adapter = new LocationAdapter(getContext(), shops);
        ListView listView = (ListView) root.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return root;
    }
}

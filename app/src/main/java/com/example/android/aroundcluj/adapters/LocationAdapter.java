package com.example.android.aroundcluj.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.android.aroundcluj.Location;
import com.example.android.aroundcluj.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Casi on 09.07.2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    public LocationAdapter(@NonNull Context context, List<Location> locations) {
        super(context, 0, locations);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_location, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = new ViewHolder(convertView);
        }

        Location currentLocation = getItem(position);
        viewHolder.titleView.setText(currentLocation.getTitle());
        viewHolder.addressView.setText(currentLocation.getAddress());

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP && currentLocation.hasImage()) {
            viewHolder.imageView.setVisibility(View.VISIBLE);
            viewHolder.imageView.setImageDrawable(getContext().getDrawable(currentLocation.getImageId()));
        } else {
            viewHolder.imageView.setVisibility(View.GONE);
        }

        if (currentLocation.hasDescription()) {
            viewHolder.descriptionView.setVisibility(View.VISIBLE);
            viewHolder.descriptionView.setText(currentLocation.getDescription());
        } else {
            viewHolder.descriptionView.setVisibility(View.GONE);
        }
        viewHolder.ratingBar.setRating(currentLocation.getRating());

        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.location_title)
        TextView titleView;
        @BindView(R.id.location_address)
        TextView addressView;
        @BindView(R.id.location_image)
        ImageView imageView;
        @BindView(R.id.location_description)
        TextView descriptionView;
        @BindView(R.id.location_rating_bar)
        RatingBar ratingBar;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}

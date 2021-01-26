package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(@NonNull Activity context,  @NonNull ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView magnitude_text_view = (TextView) listItemView.findViewById(R.id.magnitude);

        magnitude_text_view.setText(Float.toString(currentEarthquake.getMagnitude()));

        TextView city_text_view = (TextView) listItemView.findViewById(R.id.primary_location);

        city_text_view.setText(currentEarthquake.getLocation());

        Format formatter = new SimpleDateFormat("MMM dd, yyyy");
        String sDate = formatter.format(currentEarthquake.getDate());

        TextView date_text_view = (TextView) listItemView.findViewById(R.id.date);

        date_text_view.setText(sDate);

        return listItemView;
    }
}

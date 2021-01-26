/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");

        try {
            earthquakes.add(new Earthquake(7.2f, "San Francisco", sdf.parse("Feb 2, 2016")));
            earthquakes.add(new Earthquake(6.1f,"London", sdf.parse("July 20, 2015")));
            earthquakes.add(new Earthquake(3.9f,"Tokyo", sdf.parse("Nov 10, 2014")));
            earthquakes.add(new Earthquake(5.4f,"Mexico City", sdf.parse("May 3, 2014")));
            earthquakes.add(new Earthquake(2.8f,"Moscow", sdf.parse("Jan 31, 2013")));
            earthquakes.add(new Earthquake(4.9f, "Rio de Janeiro", sdf.parse("Aug 19, 2012")));
            earthquakes.add(new Earthquake(1.6f, "Paris", sdf.parse("Oct 30, 2011")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakes);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(earthquakeAdapter);
    }
}

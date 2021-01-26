package com.example.android.quakereport;

import java.util.Date;

public class Earthquake {

    private float mMagnitude;

    private String mLocation;

    private Date mDate;

    public Earthquake(float mMagnitude, String mCity, Date mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mCity;
        this.mDate = mDate;
    }

    public Date getDate() {
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }

    public float getMagnitude() {
        return mMagnitude;
    }

}

package com.example.android.quakereport;

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private String mDate;

    public Earthquake(String mMagnitude, String mCity, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mCity;
        this.mDate = mDate;
    }

    public String getDate() {
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

}

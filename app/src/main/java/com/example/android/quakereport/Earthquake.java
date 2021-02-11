package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude, String location, long timeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = timeInMilliseconds;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

}

package com.example.android.quakereport;

public class Earthquake {

    // Magnitude of Earthquake
    private double mMagnitude;

    // Location of Earthquake
    private String mLocation;

    //Time of the earthquake
    private long mTimeInMilliseconds;

    //URL
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the earthquake happened
     * @param url                is the URL
     */

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get magnitude of earthquake
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get location of the earthquake
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get date of earthquake
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }


}

package com.example.android.quakereport;
//Adding comment to be able to commit. 
public class Earthquake {

    private String mCategory;

    private String mHeadline;

    private String mDate;

    private String mUrl;



    public Earthquake(String category, String headline, String date) {
        mCategory = category;
        mHeadline = headline;
        mDate = date;
    }

//    category, headline, c, url

    public Earthquake(String category, String headline, String date, String url) {
        mCategory = category;
        mHeadline = headline;
        mDate = date;
        mUrl = url;
    }

    public String getHeadline(){
        return mHeadline;
    }

    public String getDate(){
        return mDate;
    }

    public String getCategory() {
        return mCategory;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }
}

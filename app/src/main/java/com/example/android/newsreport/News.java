package com.example.android.newsreport;

public class News {

    private String mCategory;

    private String mHeadline;

    private String mDate;

    private String mUrl;

    private String mName;

    public News(String category, String headline, String date) {
        mCategory = category;
        mHeadline = headline;
        mDate = date;
    }

//    category, headline, date, url

    public News(String category, String headline, String date, String url, String name) {
        mCategory = category;
        mHeadline = headline;
        mDate = date;
        mUrl = url;
        mName = name;
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

    public String getName(){return mName; }
    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mUrl;
    }
}

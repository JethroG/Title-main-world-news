package com.yourcompany.bro.hi.theguardiannews;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;

import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * Created by lara on 20/9/16.
 */
public class NewsLoader extends AsyncTaskLoader<List<ArtikleData>> {

    public NewsLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
        forceLoad();
    }

    @Override
    public List<ArtikleData> loadInBackground() {
        List<ArtikleData> listOfNews = null;
        try {
            URL url = Utils.createUrl();
            String jsonResponse = Utils.makeHttpRequest(url);
            listOfNews = Utils.parseJson(jsonResponse);
        } catch (IOException e) {
            Log.e("Queryutils", "Error Loader LoadInBackground: ", e);
        }
        return listOfNews;
    }
}

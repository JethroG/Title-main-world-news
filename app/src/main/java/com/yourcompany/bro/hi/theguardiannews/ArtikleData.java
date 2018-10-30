package com.yourcompany.bro.hi.theguardiannews;

import android.graphics.Bitmap;

public class ArtikleData {

    String title;
    String author;
    String url;
    String date;
    String section;
    private Bitmap mThumbnail = null;

    public ArtikleData(String title, String author, String url, String date, String section) {
        this.title = title;
        this.author = author;
        this.url = url;
        this.date = date;
        this.section = section;
    }




    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Bitmap getThumbnailBitmap() {
        return mThumbnail;
    }

    public void setThumbnailBitmap(Bitmap thumbnailBitmap) {
        mThumbnail = thumbnailBitmap;
    }

    @Override
    public String toString() {
        return "ArtikleData{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}

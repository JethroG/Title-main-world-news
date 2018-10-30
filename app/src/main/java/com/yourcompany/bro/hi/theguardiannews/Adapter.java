package com.yourcompany.bro.hi.theguardiannews;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<ArtikleData> {

    public Adapter(@NonNull Context context) {
        super(context, -1, new ArrayList<ArtikleData>());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView
                    = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        TextView title = convertView.findViewById(R.id.title);
        TextView author = convertView.findViewById(R.id.author);
        TextView date = convertView.findViewById(R.id.date);
        TextView section = convertView.findViewById(R.id.section);

        ArtikleData currentNews = getItem(position);
        title.setText(currentNews.getTitle());
        author.setText(currentNews.getAuthor());
        date.setText(currentNews.getDate());
        section.setText(currentNews.getSection());

        return convertView;
    }
}

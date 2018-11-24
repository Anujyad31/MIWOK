package com.example.anujyadav.resfolderki;


import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {

    private int mcolorId;

    public wordAdapter(Activity context, ArrayList<word> words,int colorId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mcolorId=colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.number_layout, parent, false);
        }
        word currentAndroidFlavor = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.t1);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidFlavor.getMiwok_word());




        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.t2);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidFlavor.getEng_word());


        ImageView playicon=(ImageView) listItemView.findViewById(R.id.i2);
        playicon.setImageResource(currentAndroidFlavor.getImg2());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.img1);



        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if(currentAndroidFlavor.hasimg()==true) {
            iconView.setImageResource(currentAndroidFlavor.getImg());
        }
        else
        {
            iconView.setVisibility(View.GONE);
        }
        View textContainer=listItemView.findViewById(R.id.text_container);

        int color= ContextCompat.getColor(getContext(),mcolorId);

        textContainer.setBackgroundColor(color);
        playicon.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


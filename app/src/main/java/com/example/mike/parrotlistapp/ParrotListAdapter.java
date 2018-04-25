package com.example.mike.parrotlistapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ParrotListAdapter extends ArrayAdapter<Parrot> {

    public ParrotListAdapter(Context context, ArrayList<Parrot> parrots){
        super(context, 0, parrots);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.parrots_item, parent, false);
        }

        Parrot currentParrot = getItem(position);

        TextView rankingText = ((TextView) listItemView.findViewById(R.id.rankingTextViewId));
        rankingText.setText(currentParrot.getRanking().toString());

        TextView commonName = ((TextView) listItemView.findViewById(R.id.commonNameTextViewId));
        commonName.setText(currentParrot.getCommonName());

        TextView scientificName = ((TextView) listItemView.findViewById(R.id.scientificNameTextViewId));
        scientificName.setText(currentParrot.getScientificName());

        TextView colour = ((TextView) listItemView.findViewById(R.id.colourTextViewId));
        colour.setText(currentParrot.getColour());

        listItemView.setTag(currentParrot);

        return listItemView;
    }

}

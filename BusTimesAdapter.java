package com.example.micha.newandroidapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class BusTimesAdapter extends
        RecyclerView.Adapter<BusTimesAdapter.ViewHolder> {

    public int firstIndexFinalStep = -1;

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView busCardsText;
        public CardView busCards;
        public ImageView busCardsImage;
        public TextView busCardsTitle;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            busCardsText = itemView.findViewById(R.id.bus_cards_text);
            busCards = itemView.findViewById(R.id.bus_cards);
            busCardsImage = itemView.findViewById(R.id.bus_card_image);
            busCardsTitle = itemView.findViewById(R.id.bus_card_title);
        }
    }

    // Bus Times Adapter constructor
    private ArrayList<ArrayList<String>> mTime;
    public BusTimesAdapter(ArrayList<ArrayList<String>> time) {
        mTime = time;
    }




    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public BusTimesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.fragment_bus_times, viewGroup, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }



    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        firstIndexFinalStep += 1;

        // Set item views based on your views and data model
        TextView textView = viewHolder.busCardsText;

        System.out.println(mTime);

        String displayString = "";
        String displayString1 = "";
        String displayString2 = "";





        if (firstIndexFinalStep == 0) {
            for (int j = 0; j < mTime.get(this.firstIndexFinalStep).toArray().length; j++) {
                String value = mTime.get(this.firstIndexFinalStep).get(j);
                displayString1 = displayString1 + value + ",";
            }
            displayString1 += "\n";

            for (int j = 0; j < mTime.get(this.firstIndexFinalStep+1).toArray().length; j++) {
                String value = mTime.get(this.firstIndexFinalStep+1).get(j);
                displayString2 = displayString2 + value + ",";
            }

            if (displayString1 == "") {
                displayString1 = "No buses scheduled";
            }
            if (displayString2 == "") {
                displayString2 = "No buses scheduled";
            }

            displayString = displayString1 + displayString2;

            textView.setText(displayString);




        } else if (firstIndexFinalStep == 1) {
            for (int j = 0; j < mTime.get(this.firstIndexFinalStep+1).toArray().length; j++) {
                String value = mTime.get(this.firstIndexFinalStep+1).get(j);
                displayString1 = displayString1 + value + ",";
            }
            displayString1 += "\n";

            for (int j = 0; j < mTime.get(this.firstIndexFinalStep+2).toArray().length; j++) {
                String value = mTime.get(this.firstIndexFinalStep+2).get(j);
                displayString2 = displayString2 + value + ",";
            }

            if (displayString1 == "") {
                displayString1 = "No buses scheduled";
            }
            if (displayString2 == "") {
                displayString2 = "No buses scheduled";
            }

            displayString = displayString1 + displayString2;

            textView.setText(displayString);





        } else {
            for (int j = 0; j < mTime.get(this.firstIndexFinalStep+2).toArray().length; j++) {
                String value = mTime.get(this.firstIndexFinalStep+2).get(j);
                displayString = displayString + value + ",";
                textView.setText(displayString);
            }

            if (displayString == "") {
                textView.setText("No buses scheduled");
            }
        }




        System.out.println("DISPLAY STRING");
        System.out.println(displayString);


        CardView cardview = viewHolder.busCards;
        cardview.setCardBackgroundColor(200);
        ImageView imageView = viewHolder.busCardsImage;
        imageView.setImageResource(cardImage().get(firstIndexFinalStep));
        TextView title = viewHolder.busCardsTitle;
        title.setText(busStopTitles().get(firstIndexFinalStep));
    }
    @Override
    public int getItemCount() {
        return 4;
    }

    public ArrayList<String> busStopTitles() {
        ArrayList<String> busStopTitles = new ArrayList<>();
        busStopTitles.add("South Stop");
        busStopTitles.add("Tim Hortons");
        busStopTitles.add("Lakeshore East");
        busStopTitles.add("Lakeshore West");
        return busStopTitles;
    }

    public ArrayList<Integer> cardImage() {
        ArrayList<Integer> cardImages = new ArrayList<>();
        cardImages.add(R.drawable.bus_south_stop);
        cardImages.add(R.drawable.bus_tim_hortons);
        cardImages.add(R.drawable.bus_lakeshore_moving_east);
        cardImages.add(R.drawable.bus_lakeshore_moving_west);

        return cardImages;
    }



}

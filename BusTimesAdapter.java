package com.example.micha.newandroidapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BusTimesAdapter extends
        RecyclerView.Adapter<BusTimesAdapter.ViewHolder> {

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView busCardsText;
        public CardView busCards;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            busCardsText = itemView.findViewById(R.id.bus_cards_text);
            busCards = itemView.findViewById(R.id.bus_cards);
        }
    }

    // Bus Times Adapter constructor
    private String mTime;
    public BusTimesAdapter(String time) {
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
        // Set item views based on your views and data model
        TextView textView = viewHolder.busCardsText;
        textView.setText(mTime);
        CardView cardview = viewHolder.busCards;
        cardview.setCardBackgroundColor(100);
    }
    @Override
    public int getItemCount() {
        return 1;
    }


}

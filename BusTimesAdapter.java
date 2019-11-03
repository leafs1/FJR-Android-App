package com.example.micha.newandroidapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
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





    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

    }
    @Override
    public int getItemCount() {
        return 0;
    }


}

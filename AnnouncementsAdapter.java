package com.example.micha.newandroidapp;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AnnouncementsAdapter extends
        RecyclerView.Adapter<AnnouncementsAdapter.ViewHolder> {

    public int firstIndexFinalStep = -1;

    public class ViewHolder extends RecyclerView.ViewHolder {

        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public CardView announcementsCards;
        public TextView categoryText;
        public TextView timePostedText;
        public TextView announcementText;

        public LinearLayout layout;

        public RelativeLayout relativelayout;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            categoryText = itemView.findViewById(R.id.categoryText);
            timePostedText = itemView.findViewById(R.id.timePostedText);
            announcementText = itemView.findViewById(R.id.announcementText);
            announcementsCards = itemView.findViewById(R.id.announcementCardsView);
            relativelayout = itemView.findViewById(R.id.relativelayout);
        }
    }

    // Bus Times Adapter constructor
    private ArrayList<String> mAnnouncementChannelList;
    private ArrayList<String> mAnnouncementCreatedAtList;
    private ArrayList<String> mAnnouncementMessagesList;
    public AnnouncementsAdapter(ArrayList announcementChannelList, ArrayList announcementCreatedAtList, ArrayList announcementMessagesList) {
        mAnnouncementChannelList = announcementChannelList;
        mAnnouncementCreatedAtList = announcementCreatedAtList;
        mAnnouncementMessagesList = announcementMessagesList;
    }




    // Usually involves inflating a layout from XML and returning the holder
    @NonNull
    @Override
    public AnnouncementsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.announcements, viewGroup, false);



        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //if (firstIndexFinalStep >= mAnnouncementMessagesList.toArray().length - 3) {
        // return;
        //}
        System.out.println("making date thing");
        String pattern = "MMM dd, yyyy h:mm a";
        DateFormat df = new SimpleDateFormat(pattern);

        firstIndexFinalStep += 1;
        // Set item views based on your views and data model
        TextView categoryText = viewHolder.categoryText;
        TextView timePostedText = viewHolder.timePostedText;
        TextView announcementText = viewHolder.announcementText;

        String categoryString = "";
        String timePostedString = "";
        String announcementTextString = "";

        System.out.println(mAnnouncementMessagesList.toArray().length);

        categoryString = mAnnouncementChannelList.get(this.firstIndexFinalStep);
        timePostedString = "Posted " + df.format(mAnnouncementCreatedAtList.get(this.firstIndexFinalStep));
        announcementTextString = mAnnouncementMessagesList.get(this.firstIndexFinalStep);


        categoryText.setText(categoryString);
        timePostedText.setText(timePostedString);
        announcementText.setText(announcementTextString);



        System.out.println(categoryText);
        System.out.println(timePostedText);
        System.out.println(announcementText);

        CardView cardview = viewHolder.announcementsCards;
        LinearLayout layout = viewHolder.layout;

        RelativeLayout relativelayout = viewHolder.relativelayout;

        /*
        ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) cardview.getLayoutParams();

        params.setMargins(10, 10, 10, 10);

        if (firstIndexFinalStep == 8) {
            System.out.println("setting params");
            cardview.requestLayout();

        }

         */

        if (categoryString.equals("Library")) {
            System.out.println(categoryString);
            System.out.println("setting library card");
            //cardview.setBackgroundColor(Color.YELLOW);
            relativelayout.setBackgroundColor(Color.parseColor("#7F4B26"));
            categoryText.setTextColor(Color.parseColor("#FE9045"));
            timePostedText.setTextColor(Color.parseColor("#FE9045"));
        } else if (categoryString.equals("Events")) {
            relativelayout.setBackgroundColor(Color.parseColor("#7F6C22"));
            categoryText.setTextColor(Color.parseColor("#FFD326"));
            timePostedText.setTextColor(Color.parseColor("#FFD326"));
        } else if (categoryString.equals("Sports and Clubs")) {
            relativelayout.setBackgroundColor(Color.parseColor("#20566F"));
            categoryText.setTextColor(Color.parseColor("#33BBFF"));
            timePostedText.setTextColor(Color.parseColor("#33BBFF"));
        } else if (categoryString.equals("General Announcements")) {
            relativelayout.setBackgroundColor(Color.parseColor("#545454"));
            categoryText.setTextColor(Color.parseColor("#BFBFBF"));
            timePostedText.setTextColor(Color.parseColor("#BFBFBF"));
        } else if (categoryString.equals("PLC days")) {
            relativelayout.setBackgroundColor(Color.parseColor("#523273"));
            categoryText.setTextColor(Color.parseColor("#CFA0FF"));
            timePostedText.setTextColor(Color.parseColor("#CFA0FF"));
        }
    }
    @Override
    public int getItemCount() {
        return 9;
    }


}

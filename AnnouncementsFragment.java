package com.example.micha.newandroidapp;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.parse.FindCallback;
import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class AnnouncementsFragment extends Fragment {

    public List<ParseObject> announcementssList;
    public ParseQuery<ParseObject> query = ParseQuery.getQuery("announcementsList");
    public ArrayList announcementMessagesList = new ArrayList();
    public ArrayList announcementChannelList = new ArrayList();
    public ArrayList announcementCreatedAtList = new ArrayList();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        return inflater.inflate(R.layout.announcements_main, container, false);

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        System.out.println("initialing parse");
        Parse.initialize(new Parse.Configuration.Builder(getContext())
                .applicationId(getString(R.string.back4app_app_id))
                // if defined
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build());


        // ...
        // Lookup the recyclerview in activity layout


        // Create adapter passing in the sample user data
        //AnnouncementsAdapter adapter = new AnnouncementsAdapter(rvAnnouncements);
        // Attach the adapter to the recyclerview to populate items
        //rvAnnouncements.setAdapter(adapter);
        // Set layout manager to position the items

        // That's all!


        query.whereNotEqualTo("channel", null);
        query.findInBackground(new FindCallback<ParseObject>() {
            public void done(List<ParseObject> announcementList, ParseException e) {
                if (e == null) {
                    Log.d("announcement", "Retrieved " + announcementList.size() + " announcements");
                    announcementssList = announcementList;
                    System.out.println(announcementssList);
                    System.out.println(announcementssList.toArray().length);
                    for (int i = announcementssList.toArray().length - 1; i > -1; i--) {
                        query.setSkip(i);
                        announcementMessagesList.add(announcementList.get(i).getString("message"));
                        announcementChannelList.add(announcementList.get(i).getString("channel"));
                        announcementCreatedAtList.add(announcementList.get(i).getUpdatedAt());
                    }
                    //String announcementText = announcements.getString("message");
                    //System.out.println(announcementText);
                    System.out.println(announcementMessagesList);
                    System.out.println(announcementChannelList);
                    System.out.println(announcementCreatedAtList);

                    RecyclerView rvAnnouncements = getView().findViewById(R.id.rvAnnouncements);

                    AnnouncementsAdapter adapter = new AnnouncementsAdapter(announcementChannelList, announcementCreatedAtList, announcementMessagesList);
                    rvAnnouncements.setAdapter(adapter);
                    rvAnnouncements.setLayoutManager(new LinearLayoutManager(getContext()));


                } else {
                    Log.d("retrieving", "Error: " + e.getMessage());
                }

            }

        });
        System.out.println(announcementMessagesList);

        //got info
        System.out.println("making adapter");


    }
}



        /*
        ParseQuery<ParseObject> query = ParseQuery.getQuery("announcementsList");
        query.whereNotEqualTo("channel", null);
        query.getFirstInBackground(new GetCallback<ParseObject>() {
            public void done(ParseObject announcement, ParseException e) {
                if (e == null) {
                    String announcementText = announcement.getString("message");
                    System.out.println(announcementText);
                } else {
                    // Something is wrong
                }
            }
        });
        */


        /*
       ParseQuery<ParseObject> query = ParseQuery.getQuery("SoccerPlayers");
        query.whereEqualTo("objectId", "QHjRWwgEtd");
        query.getFirstInBackground(new GetCallback<ParseObject>() {
          public void done(ParseObject player, ParseException e) {
            if (e == null) {
              String playerName = player.getString("playerName"));
              int yearOfBirth = player.getInt("yearOfBirth"));
              String emailPlayer =  player.getString("emailContact");
            } else {
              // Something is wrong
            }
          }
        });
         */





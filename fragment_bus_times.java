package com.example.micha.newandroidapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fragment_bus_times extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        return inflater.inflate(R.layout.activity_bus_times, container, false);



    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        System.out.println("Starting Parser");

        AsyncTaskRunner parser = new AsyncTaskRunner();
        // Wait for Async task to finish
        try {
            //findViewById(R.id.loadingPanel).setVisibility(View.GONE); or .VISIBLE

            parser.execute().get();

        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Now have mins in parser.mins
//        System.out.println(parser.mins);

        System.out.println("BUS TIMES COMPLETE");
        System.out.println(parser.busTimes);

        // Adapter stuff
        RecyclerView busRV = getView().findViewById(R.id.busRV);

        BusTimesAdapter busAdapter = new BusTimesAdapter(parser.busTimes);
        busRV.setAdapter(busAdapter);
        busRV.setLayoutManager(new LinearLayoutManager(getActivity()));






    }

}

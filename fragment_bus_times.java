package com.example.micha.newandroidapp;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fjrapp.R;

import java.util.concurrent.ExecutionException;

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

        Activity parentActivity = this.getActivity();
        parentActivity.findViewById(R.id.loading_icon).setVisibility(View.GONE);


        System.out.println("BUS TIMES COMPLETE");
        System.out.println(parser.busTimes);

        // Adapter stuff
        RecyclerView busRV = getView().findViewById(R.id.busRV);

        BusTimesAdapter busAdapter = new BusTimesAdapter(parser.busTimes);
        busRV.setAdapter(busAdapter);
        busRV.setLayoutManager(new LinearLayoutManager(getActivity()));






    }

}

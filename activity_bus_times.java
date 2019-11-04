package com.example.micha.newandroidapp;

import android.app.ProgressDialog;
import android.net.http.SslCertificate;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class activity_bus_times extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus_times);

        System.out.println("Starting Parser");

        AsyncTaskRunner parser = new AsyncTaskRunner();
        // Wait for Async task to finish
        try {
            parser.execute().get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Now have mins in parser.mins
        System.out.println(parser.mins);



        // Adapter stuff
        RecyclerView busRV = findViewById(R.id.busRV);

        BusTimesAdapter busAdapter = new BusTimesAdapter(parser.mins, R.drawable.bus_south_stop);
        busRV.setAdapter(busAdapter);
        busRV.setLayoutManager(new LinearLayoutManager(this));










    }

}


class AsyncTaskRunner extends AsyncTask<Void, Void, Void>{
    
    // Colonel website
    String colonelSamuelUrl = "http://www.catchttc.com/44/3690_ar";
    String colonelSamuelUrl944 = "http://www.catchttc.com/944/3690_ar";

    String timmiesUrl = "http://www.catchttc.com/44/12121";
    String timmiesURL944 = "http://www.catchttc.com/944/12121";

    String lakeshoreWest = "http://www.catchttc.com/501/5182";

    String lakeshoreEast = "http://www.catchttc.com/501/5181";

    public ArrayList<String> busURLs;

    public String mins;
    public ArrayList<String> busTimes;



    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        System.out.println("do in background time");
        busURLs.add(colonelSamuelUrl);
        busURLs.add(colonelSamuelUrl944);
        busURLs.add(timmiesUrl);
        busURLs.add(timmiesURL944);
        busURLs.add(lakeshoreWest);
        busURLs.add(lakeshoreEast);

        //Connect to the website
        System.out.println("Starting for");
        for (int i = 0; i < busURLs.toArray().length; i++) {
            System.out.println("Starting try");
            try{
            System.out.println("in try");
            Document website = Jsoup.connect(busURLs.get(i)).get();
            String rawText = website.text();

            // Get text without most extra stuff
            String delims = "[qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM, () | <]+";
            String[] colonelSplit = rawText.split(delims);

            // mins till bus arrives
            mins = colonelSplit[5];
            busTimes.add(mins);
            System.out.println(mins);

        } catch (IOException e) {
            e.printStackTrace();
        }

        }

        //Get html
        Document colonelSamuel = null;
        try {
            colonelSamuel = Jsoup.connect(colonelSamuelUrl).get();
            String colonelRawText = colonelSamuel.text();

            // Get text without most extra stuff
            String delims = "[qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM, () | <]+";
            String[] colonelSplit = colonelRawText.split(delims);

            // mins till bus arrives
            mins = colonelSplit[5];

            System.out.println(mins);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        this.cancel(true);


    }



}


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

        BusTimesAdapter busAdapter = new BusTimesAdapter(parser.mins);
        busRV.setAdapter(busAdapter);
        busRV.setLayoutManager(new LinearLayoutManager(this));










    }

}


class AsyncTaskRunner extends AsyncTask<Void, Void, Void>{

    // Colonel website
    String colonelSamuelUrl = "http://www.catchttc.com/44/3690_ar";

    public String mins;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... voids) {
        //Connect to the website
        try {
            //Get html
            Document colonelSamuel = Jsoup.connect(colonelSamuelUrl).get();
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


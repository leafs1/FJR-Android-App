package com.example.micha.newandroidapp;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.ItemListener{

    RecyclerView recyclerView;
    ArrayList arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        arrayList = new ArrayList();
        arrayList.add(new DataModel("Announcements", R.drawable.clipboard_52, "#09A9FF"));
        arrayList.add(new DataModel("Anonymous Alerts", R.drawable.anonymous_52, "#3E51B1"));
        arrayList.add(new DataModel("Schedule", R.drawable.schedule_52, "#673BB7"));
        arrayList.add(new DataModel("Bus Times", R.drawable.bus_52, "#4BAA50"));
        arrayList.add(new DataModel("Contact", R.drawable.envelope_52, "#F94336"));
        arrayList.add(new DataModel("Map", R.drawable.map_52, "#0A9B88"));
        arrayList.add(new DataModel("MyBlueprint", R.drawable.blueprint_52, "#09A9FF"));
        arrayList.add(new DataModel("Twitter", R.drawable.twitter_clear_bird_52, "#3E51B1"));
        arrayList.add(new DataModel("Website", R.drawable.globe, "#4BAA50"));
        arrayList.add(new DataModel("", R.drawable.white, "#ffffff"));


        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, arrayList, this);
        recyclerView.setAdapter(adapter);


        /**
         AutoFitGridLayoutManager that auto fits the cells by the column width defined.
         **/

        //AutoFitGridLayoutManager layoutManager = new AutoFitGridLayoutManager(this, 500);
        //recyclerView.setLayoutManager(layoutManager);


        /**
         Simple GridLayoutManager that spans two columns
         **/
        GridLayoutManager manager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(manager);






//redirect to Contacts page

        /*
        Hallelujah, it compiles! XD. I just have a quesiton. How do I add the buttons? How do I position them?
        it's automatic. Where? that's what recycler view does. Auto positions the items. Is there a way that I can
        controll that? no... why? I wanted the view to be about half way down the page.
         */
    }

    // part of stuff above
    @Override
    public void onItemClick(DataModel item) {

        if (item.text == "Contact") {

            Intent intentLoadNewActivity = new Intent(MainActivity.this, Contacts_page.class);
            startActivity(intentLoadNewActivity);
        } else {

        }

        if (item.text == "Schedule") {

            Intent intentLoadNewActivity = new Intent(MainActivity.this, Schedule.class);
            startActivity(intentLoadNewActivity);
        } else {

        }

        if (item.text == "Map") {

            Intent intentLoadNewActivity = new Intent(MainActivity.this, Map.class);
            startActivity(intentLoadNewActivity);
        } else {

        }

        if (item.text == "Bus Times") {

            Intent intentLoadNewActivity = new Intent(MainActivity.this, activity_bus_times.class);
            startActivity(intentLoadNewActivity);
        } else {

        }

        if (item.text == "Anonymous Alerts"){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.anonymousalerts.com/tcdsb/default.aspx"));
            startActivity(browserIntent);
        } else {

        }

        if (item.text == "MyBlueprint"){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://app.myblueprint.ca/?sdid=TCDSB"));
            startActivity(browserIntent);
        } else {

        }

        if (item.text == "Twitter"){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/FJRCSS?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"));
            startActivity(browserIntent);
        } else {

        }

        if (item.text == "Website"){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tcdsb.org/schools/fatherjohnredmond/Pages/default.aspx"));
            startActivity(browserIntent);
        } else {

        }
    }







//button onClick stuff

    public void anonymous_alerts(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.anonymousalerts.com/tcdsb/default.aspx"));
        startActivity(browserIntent);
    }

    public void my_blueprint(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://app.myblueprint.ca/?sdid=TCDSB"));
        startActivity(browserIntent);
    }

    public void twitter(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/FJRCSS?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor"));
        startActivity(browserIntent);
    }

    public void website(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tcdsb.org/schools/fatherjohnredmond/Pages/default.aspx"));
        startActivity(browserIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

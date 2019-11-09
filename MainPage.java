package com.example.micha.newandroidapp;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebViewFragment;

public class MainPage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "One of the creator's emails has been copied to your clipboard. Please send an email if you notice any bugs.", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Michael", "michael.adragna1@gmail.com");
                clipboard.setPrimaryClip(clip);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        Menu menu = navigationView.getMenu();

        MenuItem tools= menu.findItem(R.id.tools);
        SpannableString s = new SpannableString(tools.getTitle());
        s.setSpan(new TextAppearanceSpan(this, R.style.TextAppearance44), 0, s.length(), 0);
        tools.setTitle(s);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.main_page, menu);
        // Change return to true if want to use
        return false;
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        Fragment fragment = null;
        Bundle bundle = new Bundle();

        if (id == R.id.nav_announcements) {

        } else if (id == R.id.nav_schedule) {
            // Pass in fragment?
            fragment = new FragmentSchedule();
            toolbar.setTitle("Schedule");
        } else if (id == R.id.nav_bus_times) {
            fragment = new fragment_bus_times();
            toolbar.setTitle("Bus Times");
        } else if (id == R.id.nav_contact) {
            Intent intentLoadNewActivity = new Intent(MainPage.this, Contacts_page.class);
            startActivity(intentLoadNewActivity);
        } else if (id == R.id.nav_map) {
            fragment = new FragmentMap();
            toolbar.setTitle("Map");
        } else if (id == R.id.nav_anonymous_alerts) {
            bundle.putString("url", "https://www.anonymousalerts.com/tcdsb/default.aspx");
            fragment = new FragmentWebView();
            fragment.setArguments(bundle);
            toolbar.setTitle("Anonymous Alerts");
        } else if (id == R.id.nav_website) {
            bundle.putString("url", "https://www.tcdsb.org/schools/fatherjohnredmond/Pages/default.aspx");
            fragment = new FragmentWebView();
            fragment.setArguments(bundle);
            toolbar.setTitle("FJR Website");
        } else if (id == R.id.nav_twitter) {
            bundle.putString("url", "https://twitter.com/FJRCSS?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
            fragment = new FragmentWebView();
            fragment.setArguments(bundle);
            toolbar.setTitle("FJR Twitter");
        } else if (id == R.id.nav_myblueprint) {
            bundle.putString("url", "https://app.myblueprint.ca/?sdid=TCDSB");
            fragment = new FragmentWebView();
            fragment.setArguments(bundle);
            toolbar.setTitle("MyBlueprint");
        }
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            drawer.closeDrawer(GravityCompat.START);
            return true;
        }
        return true;
    }
}

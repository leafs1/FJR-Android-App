package com.example.micha.newandroidapp;

import android.content.Intent;
import android.os.Bundle;

import com.fjrapp.R;
import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentSchedule extends Fragment {
    private ViewPager mViewPager;
    private FragmentSchedule.SectionsPagerAdapter mSectionsPagerAdapter;
    private Intent mIntent;
    private FragmentActivity mFrgAct;
    private ViewPager help;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_schedule, container, false);


        return rootView;
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        mSectionsPagerAdapter = new FragmentSchedule.SectionsPagerAdapter(getChildFragmentManager());



        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) getView().findViewById(R.id.container);

        System.out.println("LOOK HERE FOR ERROR");
        System.out.println(getView().findViewById(R.id.container));
        System.out.println(mViewPager);

        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) getView().getRootView().findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        ImageView imageview = (ImageView) getView().findViewById(R.id.section_image);
        //imageview.setImageResource(R.drawable.first_tab_done);





    }


    /*
            @Override
            public boolean onCreateOptionsMenu(Menu menu) {
                // Inflate the menu; this adds items to the action bar if it is present.
                getMenuInflater().inflate(R.menu.menu_schedule, menu);
                return true;
            }
    */
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


    @Override
    public void onPause() {
        super.onPause();  // Always call the superclass method first
        // Do what you want.
        System.out.println("on pause time");


//        Fragment fragment = (getFragmentManager().findFragmentById(R.id.));



        //      getFragmentManager().findFragmentById(R.id.id_for_your_map_fragment).;

    //    getFragmentManager().beginTransaction().remove().commitAllowingStateLoss();
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static FragmentSchedule.PlaceholderFragment newInstance(int sectionNumber) {
            FragmentSchedule.PlaceholderFragment fragment = new FragmentSchedule.PlaceholderFragment();
            Bundle args = new Bundle();
            System.out.println("SECTION NUMBER ");
            System.out.println(sectionNumber);
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            System.out.println("ARGS HELPP");
            System.out.println(args.toString());
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_schedule, container, false);
            ImageView imageview = (ImageView) rootView.findViewById(R.id.section_image);
            int currentPage = getArguments().getInt(ARG_SECTION_NUMBER);
            System.out.println("Current Page Here");
            System.out.println(currentPage);



            switch (currentPage) {
                case 1:
                    imageview.setImageResource(R.drawable.final_first_tab);
                    break;
                case 2:
                    imageview.setImageResource(R.drawable.final_second_tab);
                    break;
                case 3:
                    imageview.setImageResource(R.drawable.final_third_tab);
                    break;
                default:
                    imageview.setImageResource(R.drawable.final_first_tab);
            }


            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public static class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            System.out.println(" POSITIONNN");
            System.out.println(position);
            return FragmentSchedule.PlaceholderFragment.newInstance(position+1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }


    }
}


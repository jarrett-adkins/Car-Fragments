package com.example.admin.carswithfragments;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements AddCarFragment.OnFragmentInteractionListener, CarListFragment.OnFragmentInteractionListener {

    private static final String CAR_LIST_FRAG_TAG = "CarListFragTag";
    List<Car> carList = new ArrayList<>();
    CarListFragment carListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carListFragment = (CarListFragment) getSupportFragmentManager().findFragmentById( R.id.fCarList );
        carListFragment.setRetainInstance( true );
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void getCar( String model, String type, String year ) {
        carList.add( new Car( model, type, year ));
        carListFragment.setCarList( carList );

        /*
        List<Car> list = new ArrayList<>();
        list.add( new Car( "model", "type", "year" ));
        list.add( new Car( "model", "type", "year" ));
        list.add( new Car( "model", "type", "year" ));
        carListFragment.setCarList( list );//*/
    }
}

/*
Create an application which has two fragments.

Fragment 1: Create a UI to add a “car” object to a list of car objects.
            The UI should have at least 3 fields (Model, Type, Year).
Fragment 2: Should have a recyclerView to show the list of car objects.

-Both of the fragments should be visible at all times
-Adding a fragment to the list would update the list and show the item in the fragment 2
-Fragment transaction should be done through the activity
-Can’t use Eventbus
 */
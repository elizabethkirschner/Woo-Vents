package com.example.elizabethkirschner.downtownworcester;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Events extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_events:
<<<<<<< HEAD
                    mTextMessage.setText("Events");
=======
>>>>>>> 4ff7a90294ddded350701bf214e84411a3298fce
                    goToEvents();
                    //TextMessage.setText(R.string.title_events);
                    return true;
                case R.id.navigation_discover:
                    goToDiscover();
                    //mTextMessage.setText(R.string.title_discover);

                    return true;
                case R.id.navigation_news:
                   // mTextMessage.setText(R.string.title_news);
                    goToNews();
                    return true;
                case R.id.navigation_transportation:
                  //  mTextMessage.setText(R.string.title_transportation);
                    goToTransportation();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    public void goToDiscover (){
        Intent intent = new Intent (this, Discover.class);
        startActivity(intent);
    }

    public void goToTransportation (){
        Intent intent = new Intent (this, Transportation.class);
        startActivity(intent);
    }

    public void goToNews (){
        Intent intent = new Intent (this, News.class);
        startActivity(intent);
    }

    public void goToEvents(){
        Intent intent = new Intent (this, Events.class);
        startActivity(intent);
    }



}

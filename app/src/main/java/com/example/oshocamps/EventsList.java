package com.example.oshocamps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EventsList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events_list);

    }

    public void perform_action(View view) {

        int id = view.getId();
        Intent intent = new Intent(EventsList.this, CampDetails.class);
        intent.putExtra("id", id);
        startActivity(intent);


    }

    public void perform_button_action(View view) {

        Intent intent = new Intent(EventsList.this, OneTimeCamps.class);
        startActivity(intent);


    }
}

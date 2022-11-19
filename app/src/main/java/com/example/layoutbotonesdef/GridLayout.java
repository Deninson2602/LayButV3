package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GridLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
    }

    public void goLinearLayout (View view){
        Intent intent = new Intent (this, LinearLayout.class);
        startActivity(intent);
    }
}
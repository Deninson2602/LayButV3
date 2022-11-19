package com.example.layoutbotonesdef;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RelativeLayout extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);
    }

    public void goTableLayout (View view){
        Intent intent = new Intent (this, TableLayout.class);
        startActivity(intent);
    }
}
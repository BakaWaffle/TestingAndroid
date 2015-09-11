package com.playground.kylef.playground;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View fabTest = findViewById (R.id.fab);
        fabTest.setOnClickListener (new View.OnClickListener() {
            @Override public void onClick(final View v) {
                Intent intent_fab = new Intent(MainActivity.this, FabTest.class);
                startActivity(intent_fab);
            }
        });
    }

}
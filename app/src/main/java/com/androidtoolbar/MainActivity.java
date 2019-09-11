package com.androidtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Adds the Toolbar to our MainActivity.
        toolBar();

    }

    // Our Toolbar
    private void toolBar() {
        Toolbar tb = findViewById(R.id.myToolbar);
        tb.setTitle("Android Toolbar");
        // tb.setTitleTextAppearance(this, R.style.toolbarTitle);
        // tb.setSubtitle("My SubTitle");
        // tb.setSubtitleTextAppearance(this, R.style.toolbarSubTitle);
        // tb.setContentInsetsAbsolute(0, 54); // Best used when setting a Logo
        // tb.setContentInsetsRelative(0, 54); // Best used when setting a Logo
        // tb.setLogo(R.mipmap.ic_launcher);
        setSupportActionBar(tb);
        if (getSupportActionBar() != null) {
            // This sets a shadow underneath the Toolbar
            getSupportActionBar().setElevation(8);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Lets inflate our menu/menu.xml file to display the Overflow menu on our Toolbar.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Here we add items to our Overflow menu in our Toolbar.
            // You can add as many items as you need.
            // You can also run other methods or classes from these menu items.
            case R.id.myMessage: // This is the id of the item in our menu.xml
                Toast.makeText(getApplicationContext(), "Our Overflow menu works! Fantastic!", Toast.LENGTH_LONG).show();
                return true;

            // This is just another toast message to give you the idea of
            // how to add multiple items to the Overflow menu.
            case R.id.anotherMessage: // This is the id of the item in our menu.xml
                Toast.makeText(getApplicationContext(), "Another item in our Overflow menu! Fantastic!", Toast.LENGTH_LONG).show();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}

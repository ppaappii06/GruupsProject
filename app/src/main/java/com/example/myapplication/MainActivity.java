package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);

        tabHost.setup();

        TabHost.TabSpec questionSpec = tabHost.newTabSpec("Question");
        questionSpec.setContent(R.id.Question);
        questionSpec.setIndicator("Question", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent intentfirst = new Intent(this, questionActivity.class);
        tabHost.addTab(questionSpec);

        TabHost.TabSpec pollingSpec = tabHost.newTabSpec("Polling");
        pollingSpec.setContent(R.id.Polling);
        pollingSpec.setIndicator("Polling", getResources().getDrawable(R.mipmap.ic_launcher));
        Intent intentSecond = new Intent(this, pollingActivity.class);
        tabHost.addTab(pollingSpec);

        TabHost.TabSpec settingsSpec = tabHost.newTabSpec("Setting");

        settingsSpec.setIndicator("Settings", getResources().getDrawable(R.mipmap.ic_launcher));
        settingsSpec.setContent(R.id.Settings);
        Intent intentThird = new Intent(this, settingsActivity.class);
        tabHost.addTab(settingsSpec);

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

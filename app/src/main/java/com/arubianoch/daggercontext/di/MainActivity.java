package com.arubianoch.daggercontext.di;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.arubianoch.daggercontext.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    SharedPreferences preferences;

    @Inject
    AppName appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplicationContext()).getMyComponent().inject(this);

        preferences.edit().putInt("Num2", 4).apply();
        preferences.edit().putString("AppName", appName.getApp()).apply();
    }
}

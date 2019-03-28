package com.arubianoch.daggercontext.di;

import android.content.Context;

import com.arubianoch.daggercontext.R;

/**
 * @author Andres Rubiano Del Chiaro
 */
public class AppName {

    private String app;
    private Context context;

    public AppName(Context context) {
        this.context = context;
    }

    public String getApp() {
        return context.getString(R.string.app_name);
    }
}

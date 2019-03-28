package com.arubianoch.daggercontext.di;

import android.app.Application;

/**
 * @author Andres Rubiano Del Chiaro
 */
public class MyApplication extends Application {

    MyComponent myComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        myComponent = DaggerMyComponent.builder()
                .sharedPreferencesModule(new SharedPreferencesModule())
                .contextModule(new ContextModule(getApplicationContext()))
                .build();
    }

    public MyComponent getMyComponent() {
        return myComponent;
    }
}

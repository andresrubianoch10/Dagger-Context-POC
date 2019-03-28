package com.arubianoch.daggercontext.di;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Module
public class SharedPreferencesModule {

    @MyApplicationScope
    @Provides
    @Inject
    SharedPreferences provideSharedPreferences(Context context) {
        return context.getSharedPreferences("pref", Context.MODE_PRIVATE);
    }
}

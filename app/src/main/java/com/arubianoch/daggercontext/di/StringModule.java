package com.arubianoch.daggercontext.di;

import android.content.Context;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Module
public class StringModule {

    @Provides
    @MyApplicationScope
    @Inject
    AppName provideAppName(Context context) {
        return new AppName(context);
    }
}

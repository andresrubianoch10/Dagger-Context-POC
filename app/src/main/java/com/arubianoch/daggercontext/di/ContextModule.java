package com.arubianoch.daggercontext.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Module
public class ContextModule {

    private Context context;

    public ContextModule(Context context) {
        this.context = context;
    }

    @Provides
    @MyApplicationScope
    Context provideContext() {
        return context;
    }
}

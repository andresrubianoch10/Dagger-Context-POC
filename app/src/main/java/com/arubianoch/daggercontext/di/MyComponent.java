package com.arubianoch.daggercontext.di;

import dagger.Component;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Component(modules = {SharedPreferencesModule.class,
        StringModule.class,
        ContextModule.class})
@MyApplicationScope
public interface MyComponent {
    void inject(MainActivity mainActivity);
}

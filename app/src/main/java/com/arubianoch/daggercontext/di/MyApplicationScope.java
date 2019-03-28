package com.arubianoch.daggercontext.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author Andres Rubiano Del Chiaro
 */
@Scope
@Retention(RetentionPolicy.CLASS)
public @interface MyApplicationScope {
}

package com.gudgie.dagger2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeActivityInjector();

}

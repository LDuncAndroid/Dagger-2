package com.gudgie.dagger2;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {AndroidInjectionModule.class, ApplicationModule.class})
public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {
}

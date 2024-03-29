package oleg.lukianenko.myarchitecture.home;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import oleg.lukianenko.myarchitecture.di.InjectionHelper;


public class App extends Application implements HasActivityInjector {

    private static InjectionHelper injectionHelper;

    @Inject
    DispatchingAndroidInjector<Activity> activityInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        injectionHelper = new InjectionHelper(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
}

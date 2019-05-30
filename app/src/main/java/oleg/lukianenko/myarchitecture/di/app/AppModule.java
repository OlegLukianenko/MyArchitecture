package oleg.lukianenko.myarchitecture.di.app;

import android.arch.lifecycle.ViewModelProvider;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import oleg.lukianenko.myarchitecture.di.home.activity.MainActivityComponent;
import oleg.lukianenko.myarchitecture.di.viewmodel.ViewModelComponent;
import oleg.lukianenko.myarchitecture.di.viewmodel.ViewModelFactory;
import oleg.lukianenko.myarchitecture.home.App;

@Module(subcomponents = {ViewModelComponent.class, MainActivityComponent.class} )
public class AppModule {

    @Provides
    SharedPreferences provideSharedPreferences(App app) {
        return app.getSharedPreferences("THIS_APP_SP", Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    ViewModelProvider.Factory provideViewModelFactory (ViewModelComponent.Builder viewModelComponent) {
        return new ViewModelFactory(viewModelComponent.build());
    }
}

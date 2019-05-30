package oleg.lukianenko.myarchitecture.di.home.activity;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import oleg.lukianenko.myarchitecture.di.home.fragment.FragmentComponent;
import oleg.lukianenko.myarchitecture.home.MainActivity;
import oleg.lukianenko.myarchitecture.viewmodel.MainActivityViewModel;

@Module (subcomponents = FragmentComponent.class)
public class MainActivityModule {

    @Provides
    MainActivityViewModel provideMainActivityViewModel(MainActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(MainActivityViewModel.class);
    }
}

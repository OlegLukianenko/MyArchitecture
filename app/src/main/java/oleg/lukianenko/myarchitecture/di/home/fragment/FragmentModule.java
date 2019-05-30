package oleg.lukianenko.myarchitecture.di.home.fragment;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import oleg.lukianenko.myarchitecture.home.FragmentExample;
import oleg.lukianenko.myarchitecture.viewmodel.FragmentViewModel;

@Module
public class FragmentModule {

    @Provides
    FragmentViewModel provideFragmentViewModel(FragmentExample fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(FragmentViewModel.class);
    }

}

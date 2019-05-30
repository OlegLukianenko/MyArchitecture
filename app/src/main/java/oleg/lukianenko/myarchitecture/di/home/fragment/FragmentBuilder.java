package oleg.lukianenko.myarchitecture.di.home.fragment;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import dagger.android.support.FragmentKey;
import oleg.lukianenko.myarchitecture.home.FragmentExample;

@Module
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(FragmentExample.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindExampleFragment (FragmentComponent.Builder builder);

}
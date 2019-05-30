package oleg.lukianenko.myarchitecture.di.home.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import oleg.lukianenko.myarchitecture.home.FragmentExample;


@Subcomponent (modules = FragmentModule.class)
public interface FragmentComponent extends AndroidInjector<FragmentExample> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FragmentExample> {
    }
}

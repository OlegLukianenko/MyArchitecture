package oleg.lukianenko.myarchitecture.di.home.activity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import oleg.lukianenko.myarchitecture.di.home.fragment.FragmentBuilder;
import oleg.lukianenko.myarchitecture.home.MainActivity;

@Subcomponent(modules = {MainActivityModule.class, FragmentBuilder.class})
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> { }

}

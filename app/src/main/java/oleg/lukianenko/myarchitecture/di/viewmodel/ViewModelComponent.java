package oleg.lukianenko.myarchitecture.di.viewmodel;

import dagger.Subcomponent;
import oleg.lukianenko.myarchitecture.viewmodel.FragmentViewModel;
import oleg.lukianenko.myarchitecture.viewmodel.MainActivityViewModel;


@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    MainActivityViewModel mainActivityViewModel();

    FragmentViewModel fragmentViewModel();



}

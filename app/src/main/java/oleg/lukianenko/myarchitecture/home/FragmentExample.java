package oleg.lukianenko.myarchitecture.home;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import javax.inject.Inject;

import oleg.lukianenko.myarchitecture.R;
import oleg.lukianenko.myarchitecture.base.BaseFragment;
import oleg.lukianenko.myarchitecture.databinding.FragmentExampleBinding;
import oleg.lukianenko.myarchitecture.di.viewmodel.Injectable;
import oleg.lukianenko.myarchitecture.viewmodel.FragmentViewModel;


public class FragmentExample extends BaseFragment<FragmentExampleBinding> implements Injectable {

    @Inject
    FragmentViewModel fragmentViewModel;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_example;
    }

}

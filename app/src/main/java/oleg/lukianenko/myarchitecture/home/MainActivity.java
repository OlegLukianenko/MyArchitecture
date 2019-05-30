package oleg.lukianenko.myarchitecture.home;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import oleg.lukianenko.myarchitecture.R;
import oleg.lukianenko.myarchitecture.base.BaseActivity;
import oleg.lukianenko.myarchitecture.databinding.ActivityMainBinding;
import oleg.lukianenko.myarchitecture.viewmodel.MainActivityViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding>
        implements HasSupportFragmentInjector {

    @Inject
    protected DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Inject
    protected MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addFragment(mBinding.cardinal.getId(), new FragmentExample());
    }

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_main;
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentInjector;
    }
}

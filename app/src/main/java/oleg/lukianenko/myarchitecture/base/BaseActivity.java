package oleg.lukianenko.myarchitecture.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public abstract class BaseActivity <V extends ViewDataBinding> extends AppCompatActivity {

    protected V mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this , getActivityLayout());
    }

    @LayoutRes
    protected abstract int getActivityLayout();

    protected void showToast(String text, int toastLength) {
        Toast.makeText(this, text, toastLength).show();
    }

    protected void addFragment(int viewID, Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(viewID, fragment).addToBackStack(null).commit();
    }

    protected void showFragment(int viewID, Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(viewID, fragment).commit();
    }
}

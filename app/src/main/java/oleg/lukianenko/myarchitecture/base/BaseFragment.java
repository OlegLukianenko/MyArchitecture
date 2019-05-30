package oleg.lukianenko.myarchitecture.base;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public abstract class BaseFragment<T extends ViewDataBinding> extends Fragment {

    protected T mBinding;
    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding     =   DataBindingUtil.inflate(inflater, getFragmentLayout(), container, false);
        return mBinding.getRoot();
    }

    @LayoutRes
    protected abstract int getFragmentLayout();


    protected void showToast(String text, int toastLength) {
        Toast.makeText(mContext, text, toastLength).show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mContext = context;
    }
}

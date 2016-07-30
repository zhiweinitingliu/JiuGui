package com.jiugui.shop.resetbuild.jiugui.fragment;

import android.content.Context;
import android.view.View;

import com.jiugui.shop.resetbuild.jiugui.R;
import com.jiugui.shop.resetbuild.jiugui.base.BaseFragment;

/**
 * Created by jyd on 16/7/30.
 */
public class FragmentHome extends BaseFragment {

    private Context context;

    @Override
    public View initView() {
        context = getActivity();
        View view = View.inflate(context, R.layout.fragment_home, null);
        return view;
    }

    @Override
    public void initData() {

    }
}

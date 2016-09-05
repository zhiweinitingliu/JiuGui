package com.jiugui.shop.resetbuild.jiugui.fragment;

import android.content.Context;
import android.util.Log;
import android.view.View;

import com.jiugui.shop.resetbuild.jiugui.R;
import com.jiugui.shop.resetbuild.jiugui.base.BaseFragment;
import com.yolanda.nohttp.NoHttp;
import com.yolanda.nohttp.RequestMethod;
import com.yolanda.nohttp.rest.OnResponseListener;
import com.yolanda.nohttp.rest.Request;
import com.yolanda.nohttp.rest.RequestQueue;
import com.yolanda.nohttp.rest.Response;

/**
 * Created by jyd on 16/7/30.
 */
public class FragmentCategory extends BaseFragment {
    private Context context;

    private static final String TAG = "FragmentCategory";

    @Override
    public View initView() {
        context=getActivity();
        View view=View.inflate(context, R.layout.fragment_category,null);
        return view;
    }

    @Override
    public void initData() {
        String url="http://demo.jiuyunda.net:24799/api/v2/home_page/index?userinfo_id=56c45924c2fb4e2050000022";

        Request<String> request = NoHttp.createStringRequest(url, RequestMethod.GET);

        RequestQueue requestQueue=NoHttp.newRequestQueue();

        requestQueue.add(100, request, new OnResponseListener<String>() {
            @Override
            public void onStart(int what) {

            }

            @Override
            public void onSucceed(int what, Response<String> response) {
                Log.e(TAG, "onSucceed: -----"+response.get() );
            }

            @Override
            public void onFailed(int what, Response<String> response) {
                Log.e(TAG, "onFailed: --------"+response.get() );
            }

            @Override
            public void onFinish(int what) {

            }
        });
    }
}

package com.jiugui.shop.resetbuild.jiugui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.jiugui.shop.resetbuild.jiugui.base.BaseFragmentActivity;
import com.jiugui.shop.resetbuild.jiugui.fragment.FragmentCart;
import com.jiugui.shop.resetbuild.jiugui.fragment.FragmentCategory;
import com.jiugui.shop.resetbuild.jiugui.fragment.FragmentFind;
import com.jiugui.shop.resetbuild.jiugui.fragment.FragmentHome;
import com.jiugui.shop.resetbuild.jiugui.fragment.FragmentPerson;
import com.jiugui.shop.resetbuild.jiugui.model.SlideImageIconSecKill;
import com.jiugui.shop.resetbuild.jiugui.model.Tab;
import com.jiugui.shop.resetbuild.jiugui.utils.OkHttpData;
import com.jiugui.shop.resetbuild.jiugui.view.FragmentTabHost;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import okhttp3.Call;


public class MainActivity extends BaseFragmentActivity {

//    "http://demo.jiuyunda.net:24799/api/v2/home_page/index"
//    56c45924c2fb4e2050000022

    private Context context;

    private OkHttpData okHttpData;

    /**
     * tabhost的内容
     */
    private FrameLayout realtabcontent;
    private FrameLayout tabcontent;
    private FragmentTabHost tabhost;

    private List<Tab> mTabs;


    @Override
    public void setContent() {
        setContentView(R.layout.activity_main);
    }

    public void initView() {
        context = this;
        mTabs = new ArrayList<>(5);
        realtabcontent = (FrameLayout) findViewById(R.id.realtabcontent);
        tabcontent = (FrameLayout) findViewById(R.id.tabhost);
        tabhost = (FragmentTabHost) findViewById(R.id.tabhost);
        initTab();

    }

    private void initTab() {
        Tab tab_home = new Tab(FragmentHome.class, R.string.home, R.drawable.select_icon_home);
        Tab tab_category = new Tab(FragmentCategory.class, R.string.category, R.drawable.select_icon_categroy);
        Tab tab_find = new Tab(FragmentFind.class, R.string.find, R.drawable.select_icon_find);
        Tab tab_cart = new Tab(FragmentCart.class, R.string.cart, R.drawable.select_icon_cart);
        Tab tab_person = new Tab(FragmentPerson.class, R.string.person, R.drawable.select_icon_person);

        mTabs.add(tab_home);
        mTabs.add(tab_category);
        mTabs.add(tab_find);
        mTabs.add(tab_cart);
        mTabs.add(tab_person);

        tabhost.setup(context, getSupportFragmentManager(), R.id.realtabcontent);

        for (Tab tab : mTabs) {

            TabHost.TabSpec tabSpec = tabhost.newTabSpec(getString(tab.getTitle()));
            tabSpec.setIndicator(biuldIndicator(tab));

            tabhost.addTab(tabSpec, tab.getFragment(), null);
        }
        tabhost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        tabhost.setCurrentTab(0);
    }

    private View biuldIndicator(Tab tab) {
        View view = View.inflate(context, R.layout.tab_indicator, null);
        ImageView icon_tab = (ImageView) view.findViewById(R.id.icon_tab);
        TextView txt_indicator = (TextView) view.findViewById(R.id.txt_indicator);

        icon_tab.setImageResource(tab.getIcon());
        txt_indicator.setText(getString(tab.getTitle()));

        return view;
    }

    public void initData() {
        okHttpData = new OkHttpData(context);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userinfo_id", "56c45924c2fb4e2050000022");
        okHttpData.get(slideCallBack, "http://demo.jiuyunda.net:24799/api/v2/home_page/index", hashMap);
    }


    /**
     * 获取轮播图 icon 秒杀的回调
     */
    StringCallback slideCallBack = new StringCallback() {
        @Override
        public void onError(Call call, Exception e, int id) {

        }

        @Override
        public void onResponse(String response, int id) {
            SlideImageIconSecKill slideImageIconSecKill = JSON.parseObject(response, SlideImageIconSecKill.class);

        }
    };

}
